package zaggle.xpns.elk.service.mapper;

import zaggle.xpns.elk.domain.CardOrderElk;
import zaggle.xpns.elk.service.dto.CardOrderApiDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardOrderMapper extends EntityMapper<CardOrderApiDto, CardOrderElk>{
    CardOrderElk toEntity(CardOrderApiDto cardOrderApiDto);
}
