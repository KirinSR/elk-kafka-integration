package zaggle.xpns.elk.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeApiDto {
    @Id
    private Long id;
    private String empId;
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
