package zaggle.xpns.elk.domain;

import zaggle.xpns.elk.domain.enumeration.CardStatus;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
@Builder
@Document(indexName="card")
public class Card implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    private String kitNumber;

    private Long cardLastDigit;

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
//    private Double totalPrice;

    private String orgId;


}
