package zaggle.xpns.elk.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseApiDto {
    private Long requestId;
    private String emailId;
    private BigDecimal amount;
    private String paymentMethodName;
    private String categoryName;
    private String requestPurpose;
    private LocalDate submittedOn;
    private String request;
    private Long statusId;
}