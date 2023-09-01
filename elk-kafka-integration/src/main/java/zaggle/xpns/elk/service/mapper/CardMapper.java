package zaggle.xpns.elk.service.mapper;

import zaggle.xpns.elk.domain.Card;
import zaggle.xpns.elk.service.dto.CardApiDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper extends EntityMapper<CardApiDto, Card>{
    Card toEntity(CardApiDto cardApiDto);
}