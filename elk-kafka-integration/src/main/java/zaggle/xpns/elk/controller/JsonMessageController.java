package zaggle.xpns.elk.controller;

//import com.zis.platform.opensearchkafka.service.*;
//import com.zis.platform.opensearchkafka.service.dto.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zaggle.xpns.elk.service.CardTransactionService;
import zaggle.xpns.elk.service.dto.*;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
    private final CardTransactionService cardTransactionService;

    public JsonMessageController(CardTransactionService cardTransactionService) {
        this.cardTransactionService = cardTransactionService;
    }


    //todo:   api for sending data to kafka topic
    @PostMapping("/cardTxn")
    public ResponseEntity<Object> cardTxn(@RequestBody CardTxnApiDto cardTxnApiDto){
        if(cardTxnApiDto == null) {
            return ResponseEntity.badRequest().body("Invalid cardTxnApiDto payload");
        }
        CardTxnApiDto cardTxnApiDto1= cardTransactionService.saveCardTransaction(cardTxnApiDto);
        return ResponseEntity.ok(cardTxnApiDto1);
    }

    @PostMapping("/cardInventory")
    public ResponseEntity<Object> cardInventory(@RequestBody CardInventoryApiDto cardInventoryApiDto){
        if(cardInventoryApiDto == null) {
            return ResponseEntity.badRequest().body("Invalid cardTxnApiDto payload");
        }
        CardInventoryApiDto result= cardTransactionService.saveCardInventory(cardInventoryApiDto);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/cardPool")
    public ResponseEntity<Object> cardPool(@RequestBody CardPoolInfoApiDto cardPoolInfoApiDto){
        if(cardPoolInfoApiDto == null) {
            return ResponseEntity.badRequest().body("Invalid cardTxnApiDto payload");
        }
        CardPoolInfoApiDto result= cardTransactionService.saveCardPool(cardPoolInfoApiDto);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/cardOrder")
    public ResponseEntity<Object> cardOrder(@RequestBody CardOrderApiDto cardOrderApiDto){
        if(cardOrderApiDto == null) {
            return ResponseEntity.badRequest().body("Invalid cardTxnApiDto payload");
        }
        CardOrderApiDto result= cardTransactionService.saveCardOrder(cardOrderApiDto);
        return ResponseEntity.ok(result);
    }

    @PostMapping(value ="/cardOrgEmp",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> cardOrgEmp(@RequestBody CardOrgEmployeeAssociationApiDto cardOrgEmployeeAssociationApiDto){
        if(cardOrgEmployeeAssociationApiDto == null) {
            return ResponseEntity.badRequest().body("Invalid cardTxnApiDto payload");
        }
        CardOrgEmployeeAssociationApiDto result= cardTransactionService.saveCardOrg(cardOrgEmployeeAssociationApiDto);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/card")
    public ResponseEntity<Object> card(@RequestBody CardApiDto cardApiDto){
        if(cardApiDto == null) {
            return ResponseEntity.badRequest().body("Invalid cardApiDto payload");
        }
        CardApiDto result= cardTransactionService.saveCard(cardApiDto);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/employee")
    public ResponseEntity<Object> employee(@RequestBody EmployeeApiDto employeeApiDto){
        if(employeeApiDto == null) {
            return ResponseEntity.badRequest().body("Invalid employeeApiDto payload");
        }
        EmployeeApiDto result= cardTransactionService.saveEmployee(employeeApiDto);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/expense")
    public ResponseEntity<Object> expense(@RequestBody ExpenseApiDto expenseApiDto){
        if(expenseApiDto == null) {
            return ResponseEntity.badRequest().body("Invalid expenseApiDto payload");
        }
        ExpenseApiDto result= cardTransactionService.saveExpense(expenseApiDto);
        return ResponseEntity.ok(result);
    }

}
