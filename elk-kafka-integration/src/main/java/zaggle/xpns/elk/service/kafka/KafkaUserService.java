package zaggle.xpns.elk.service.kafka;

//import com.zis.platform.opensearchkafka.domain.*;
//import com.zis.platform.opensearchkafka.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zaggle.xpns.elk.domain.*;
import zaggle.xpns.elk.repository.*;


@Service
public class KafkaUserService {
    @Autowired
    private final CardTransactionElkRepository cardTransactionElkRepository;
    @Autowired
    private final CardOrderElkRepository cardOrderElkRepository;
    @Autowired
    private final CardInventoryElkRepository cardInventoryElkRepository;
    @Autowired
    private final CardPoolInfoElkRepository cardPoolInfoElkRepository;
    @Autowired
    private final CardOrgEmployeeAssociationElkRepository cardOrgEmployeeAssociationElkRepository;

    public KafkaUserService(CardTransactionElkRepository cardTransactionElkRepository, CardOrderElkRepository cardOrderElkRepository,
                            CardInventoryElkRepository cardInventoryElkRepository, CardPoolInfoElkRepository cardPoolInfoElkRepository,
                            CardOrgEmployeeAssociationElkRepository cardOrgEmployeeAssociationElkRepository) {
        this.cardTransactionElkRepository = cardTransactionElkRepository;
        this.cardOrderElkRepository = cardOrderElkRepository;
        this.cardInventoryElkRepository = cardInventoryElkRepository;
        this.cardPoolInfoElkRepository = cardPoolInfoElkRepository;
        this.cardOrgEmployeeAssociationElkRepository = cardOrgEmployeeAssociationElkRepository;
    }

    //todo:       used saveUser and findAllUsers methods in json kafka consumer
    public void saveObject(Object object) {
        Class clazz = object.getClass();
        switch (clazz.getName()) {
            case "CardTransactionElk":
                cardTransactionElkRepository.save((CardTransactionElk) object);
                break;
            case "CardOrderElk":
                cardOrderElkRepository.save((CardOrderElk) object);
                break;
            case "CardInventoryElk":
                cardInventoryElkRepository.save((CardInventoryElk) object);
                break;
            case "CardPoolInfoElk":
                cardPoolInfoElkRepository.save((CardPoolInfoElk) object);
                break;
            case "CardOrgEmployeeAssociationElk":
                cardOrgEmployeeAssociationElkRepository.save((CardOrgEmployeeAssociationElk) object);
                break;
            default:
                // throw exception or handle error
                break;
        }
    }

}

