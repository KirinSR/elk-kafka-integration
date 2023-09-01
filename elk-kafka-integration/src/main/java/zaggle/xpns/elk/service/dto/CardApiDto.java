package zaggle.xpns.elk.service.dto;

import zaggle.xpns.elk.domain.enumeration.CardStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CardApiDto {
    @Id
    private Long id;

    private String kitNumber;

    private Integer cardLastDigit;

    private String bank;

    private Long cardQty;

    private Long cardId;

    private String empUserId;

    private String empId;

    private String entityId;

    @Enumerated(EnumType.STRING)
    private CardStatus status;

    private Integer cardTypeId;

    private String emobossmentType;

    private String orgId;
}
