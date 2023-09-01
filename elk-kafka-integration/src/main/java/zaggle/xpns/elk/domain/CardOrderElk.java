package zaggle.xpns.elk.domain;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A CardOrder.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
@Builder
@Document(indexName="org_card_order")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class CardOrderElk implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String orgId;

    private Integer cardTypeId;

    private String bank;

    private Double totalPrice;

    private Boolean cardEmobossing;

    private String emobossmentType;

    private Integer cardQty;

    private String companyName;

    private String country;

    private String pincode;

    private String city;

    private String state;

    private String street1;

    private String street2;

    private String createdBy;

    private LocalDateTime createdDt;

    private LocalDateTime updatedDt;

    private String updatedBy;

}
