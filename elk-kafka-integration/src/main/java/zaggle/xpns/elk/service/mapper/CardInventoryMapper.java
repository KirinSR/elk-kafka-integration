package zaggle.xpns.elk.service.mapper;

import zaggle.xpns.elk.domain.CardInventoryElk;
import zaggle.xpns.elk.service.dto.CardInventoryApiDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardInventoryMapper extends EntityMapper<CardInventoryApiDto, CardInventoryElk>{
    CardInventoryElk toEntity(CardInventoryApiDto cardInventoryApiDto);
}
