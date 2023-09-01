package zaggle.xpns.elk.service.dto;

import zaggle.xpns.elk.domain.enumeration.CardStatus;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import java.time.LocalDate;

public class CardOrgEmployeeAssociationApiDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;

    private Integer cardId;

    private String empUserId;

    private String orgId;

    @Enumerated(EnumType.STRING)
    private CardStatus status;

    private Boolean isAssinged;

    private String entityId;

    private String createdBy;

    private LocalDate createdDt;

    private LocalDate updatedDt;

    private String updatedBy;

}
