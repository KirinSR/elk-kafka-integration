package zaggle.xpns.elk.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * A CardPoolInfo.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
@Builder
@Document(indexName="card_pool_info")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class CardPoolInfoElk {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String bank;

    private Double processor;

    private String cms;

    private Integer cardQty;

    private LocalDate requestDate;

    private LocalDate uploadDate;

    private String createdBy;

    private LocalDate createdDt;

    private LocalDate updatedDt;

    private String updatedBy;

    @Field(type = FieldType.Nested)
    @JsonIgnoreProperties(value = { "cardOrgEmployeeAssociation", "cardPoolInfo" }, allowSetters = true)
    private Set<CardInventoryElk> cardInventoryElk = new HashSet<>();

}
