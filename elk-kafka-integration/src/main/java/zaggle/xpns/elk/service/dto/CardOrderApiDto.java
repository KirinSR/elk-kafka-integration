package zaggle.xpns.elk.service.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CardOrderApiDto implements Serializable {
    private static final long serialVersionUID = 1L;

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
