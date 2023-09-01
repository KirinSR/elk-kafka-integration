package zaggle.xpns.elk.service;

//import com.zis.platform.opensearchkafka.service.dto.*;
import zaggle.xpns.elk.service.dto.*;

public interface CardTransactionService {
    CardTxnApiDto saveCardTransaction(CardTxnApiDto cardTxnApiDto);

    CardInventoryApiDto saveCardInventory(CardInventoryApiDto cardInventoryApiDto);

    CardOrderApiDto saveCardOrder(CardOrderApiDto cardOrderApiDto);

    CardPoolInfoApiDto saveCardPool(CardPoolInfoApiDto cardPoolInfoApiDto);

    CardOrgEmployeeAssociationApiDto saveCardOrg(CardOrgEmployeeAssociationApiDto cardOrgEmployeeAssociationApiDto);

    CardApiDto saveCard(CardApiDto cardApiDto);

    EmployeeApiDto saveEmployee(EmployeeApiDto employeeApiDto);

    ExpenseApiDto saveExpense(ExpenseApiDto expenseApiDto);
}
