package zaggle.xpns.elk.domain;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
@Builder
@Document(indexName="expense")
public class Expense implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;
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

