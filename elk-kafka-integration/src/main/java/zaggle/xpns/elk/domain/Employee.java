package zaggle.xpns.elk.domain;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
@Builder
@Document(indexName="employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;
    private String empId;
    //    private String submitter;
    private String userName;
    private String emailId;
    private String orgId;
    private String role;
    private String references;
    private Double amount;
    private String approver;
    private String reportingTo;
    private String reqName;
    private String status;
    private String KYCStatus;
}