package zaggle.xpns.elk.domain;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A CardOrgEmployeeAssociation.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
@Builder
@Document(indexName="card_org_emp_association")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class CardOrgEmployeeAssociationElk implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private Integer cardId;

    private String empUserId;

    private String orgId;

//    @Enumerated(EnumType.STRING)
//    private CardStatus status;

    private Boolean isAssinged;

    private String entityId;

    private String createdBy;

    private LocalDate createdDt;

    private LocalDate updatedDt;

    private String updatedBy;
//    @JsonIgnoreProperties(value = { "cardOrgEmployeeAssociation", "cardPoolInfo" }, allowSetters = true)
//    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(unique = true)
//    private CardInventoryElk cardInventory;

}
