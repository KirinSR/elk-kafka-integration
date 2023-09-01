package zaggle.xpns.elk.service.impl;

//import com.zis.platform.opensearchkafka.domain.*;
//import com.zis.platform.opensearchkafka.repository.*;
import zaggle.xpns.elk.domain.*;
import zaggle.xpns.elk.repository.*;
import zaggle.xpns.elk.service.CardTransactionService;
//import com.zis.platform.opensearchkafka.service.dto.*;
import zaggle.xpns.elk.service.dto.*;
import zaggle.xpns.elk.service.kafka.JsonKafkaProducer;
//import com.zis.platform.opensearchkafka.service.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zaggle.xpns.elk.service.mapper.*;

//import javax.transaction.Transactional;

@Service
@Transactional
public class CardServiceImpl implements CardTransactionService {

    @Autowired
    private JsonKafkaProducer kafkaProducer;
    @Autowired
    private final CardTransactionElkRepository cardTransactionElkRepository;
    @Autowired
    private final CardTransactionElkMapper cardTransactionElkMapper;
    private final CardInventoryElkRepository cardInventoryElkRepository;
    private final CardInventoryMapper cardInventoryMapper;
    private final CardOrderMapper cardOrderMapper;
    private final CardOrderElkRepository cardOrderElkRepository;
    private final CardOrgEmployeeAssociationMapper cardOrgEmployeeAssociationMapper;
    private final CardOrgEmployeeAssociationElkRepository cardOrgEmployeeAssociationElkRepository;
    private final CardPoolInfoElkRepository cardPoolInfoElkRepository;
    private final CardPoolInfoMapper cardPoolInfoMapper;
    private  final CardMapper cardMapper;
    private  final CardRepository cardRepository;
//    private final EmployeeMapper employeeMapper;
    private final EmployeeMapper employeeMapper;
    private final EmployeeRepository employeeRepository;

    private final ExpenseRepository expenseRepository;
    private final ExpenseMapper expenseMapper;

    public CardServiceImpl(CardTransactionElkRepository cardTransactionElkRepository,
                           CardTransactionElkMapper cardTransactionElkMapper, JsonKafkaProducer kafkaProducer,
                           CardInventoryElkRepository cardInventoryElkRepository, CardInventoryMapper cardInventoryMapper,
                           CardOrderMapper cardOrderMapper, CardOrderElkRepository cardOrderElkRepository,
                           CardOrgEmployeeAssociationMapper cardOrgEmployeeAssociationMapper,
                           CardOrgEmployeeAssociationElkRepository cardOrgEmployeeAssociationElkRepository, CardPoolInfoElkRepository cardPoolInfoElkRepository, CardPoolInfoMapper cardPoolInfoMapper, CardMapper cardMapper, CardRepository cardRepository, EmployeeMapper employeeMapper, EmployeeRepository employeeRepository, ExpenseRepository expenseRepository, ExpenseMapper expenseMapper) {
        this.cardTransactionElkRepository = cardTransactionElkRepository;
        this.cardTransactionElkMapper = cardTransactionElkMapper;
        this.kafkaProducer = kafkaProducer;
        this.cardInventoryElkRepository = cardInventoryElkRepository;
        this.cardInventoryMapper = cardInventoryMapper;
        this.cardOrderMapper = cardOrderMapper;
        this.cardOrderElkRepository = cardOrderElkRepository;
        this.cardOrgEmployeeAssociationMapper = cardOrgEmployeeAssociationMapper;
        this.cardOrgEmployeeAssociationElkRepository = cardOrgEmployeeAssociationElkRepository;
        this.cardPoolInfoElkRepository = cardPoolInfoElkRepository;
        this.cardPoolInfoMapper = cardPoolInfoMapper;
        this.cardMapper = cardMapper;
        this.cardRepository = cardRepository;
        this.employeeMapper = employeeMapper;
        this.employeeRepository = employeeRepository;
        this.expenseRepository = expenseRepository;
        this.expenseMapper = expenseMapper;
    }

    @Override
    public CardTxnApiDto saveCardTransaction(CardTxnApiDto cardTxnApiDto) {
        CardTransactionElk cardTransactionElk = cardTransactionElkMapper.toEntity(cardTxnApiDto);
        cardTransactionElk = cardTransactionElkRepository.save(cardTransactionElk);
        kafkaProducer.sendMessage(cardTransactionElk);
        return cardTransactionElkMapper.toDto(cardTransactionElk);
    }

    @Override
    public CardInventoryApiDto saveCardInventory(CardInventoryApiDto cardInventoryApiDto) {
        CardInventoryElk cardInventoryElk = cardInventoryMapper.toEntity(cardInventoryApiDto);
        cardInventoryElk = cardInventoryElkRepository.save(cardInventoryElk);
        kafkaProducer.sendMessage(cardInventoryElk);
        return cardInventoryMapper.toDto(cardInventoryElk);
    }

    @Override
    public CardOrderApiDto saveCardOrder(CardOrderApiDto cardOrderApiDto) {
        CardOrderElk cardOrderElk = cardOrderMapper.toEntity(cardOrderApiDto);
        cardOrderElk = cardOrderElkRepository.save(cardOrderElk);
        kafkaProducer.sendMessage(cardOrderElk);
        return cardOrderMapper.toDto(cardOrderElk);
    }

    @Override
    public CardPoolInfoApiDto saveCardPool(CardPoolInfoApiDto cardPoolInfoApiDto) {
        CardPoolInfoElk cardPoolInfoElk = cardPoolInfoMapper.toEntity(cardPoolInfoApiDto);
        cardPoolInfoElk = cardPoolInfoElkRepository.save(cardPoolInfoElk);
        kafkaProducer.sendMessage(cardPoolInfoElk);
        return cardPoolInfoMapper.toDto(cardPoolInfoElk);
    }

    @Override
    public CardOrgEmployeeAssociationApiDto saveCardOrg(CardOrgEmployeeAssociationApiDto cardOrgEmployeeAssociationApiDto) {
        CardOrgEmployeeAssociationElk cardOrgEmployeeAssociationElk = cardOrgEmployeeAssociationMapper.toEntity(cardOrgEmployeeAssociationApiDto);
        cardOrgEmployeeAssociationElk = cardOrgEmployeeAssociationElkRepository.save(cardOrgEmployeeAssociationElk);
        kafkaProducer.sendMessage(cardOrgEmployeeAssociationElk);
        return cardOrgEmployeeAssociationMapper.toDto(cardOrgEmployeeAssociationElk);
    }

    @Override
    public CardApiDto saveCard(CardApiDto cardApiDto){
        Card card = cardMapper.toEntity(cardApiDto);
        card = cardRepository.save(card);
        kafkaProducer.sendMessage(card);
        return cardMapper.toDto(card);
    }

    @Override
    public EmployeeApiDto saveEmployee(EmployeeApiDto employeeApiDto) {
        Employee employee = employeeMapper.toEntity(employeeApiDto);
        employee = employeeRepository.save(employee);
        kafkaProducer.sendMessage(employee);
        return employeeMapper.toDto(employee);
    }

    @Override
    public ExpenseApiDto saveExpense(ExpenseApiDto expenseApiDto) {
        Expense expense = expenseMapper.toEntity(expenseApiDto);
        expense = expenseRepository.save(expense);
        kafkaProducer.sendMessage(expense);
        return expenseMapper.toDto(expense);
    }


}
