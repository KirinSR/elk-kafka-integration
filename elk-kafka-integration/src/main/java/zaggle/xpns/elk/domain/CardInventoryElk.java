package zaggle.xpns.elk.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A CardInventory.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
@Builder
@Document(indexName="card_inventory")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class CardInventoryElk implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String kitNumber;

    private Integer cardLastDigit;

    private String expiryDate;

    private Boolean isAllocated;

    private String status;

    private String createdBy;

    private LocalDate createdDt;

    private LocalDate updatedDt;

    private String updatedBy;

//    @JsonIgnoreProperties(value = { "cardInventoryElk" }, allowSetters = true)
//    @OneToOne(mappedBy = "cardInventory")
//    private CardOrgEmployeeAssociationElk cardOrgEmployeeAssociationElk;
//
//    @JsonIgnoreProperties(value = { "cardInventories" }, allowSetters = true)
//    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
//    private CardPoolInfoElk cardPoolInfoElk;

}
