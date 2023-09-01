package zaggle.xpns.elk.service.dto;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CardPoolInfoApiDto implements Serializable {
    private static final long serialVersionUID = 1L;
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

//    @Field(type = FieldType.Nested)
//    private Set<CardInventoryApiDto> cardInventorieElk = new HashSet<>();
}
