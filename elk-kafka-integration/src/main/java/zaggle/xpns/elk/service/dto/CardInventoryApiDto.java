package zaggle.xpns.elk.service.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CardInventoryApiDto implements Serializable {
    private static final long serialVersionUID = 1L;
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

}