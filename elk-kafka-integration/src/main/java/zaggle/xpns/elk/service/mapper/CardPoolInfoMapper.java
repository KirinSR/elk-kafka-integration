package zaggle.xpns.elk.service.mapper;

import zaggle.xpns.elk.domain.CardPoolInfoElk;
import zaggle.xpns.elk.service.dto.CardPoolInfoApiDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardPoolInfoMapper extends EntityMapper<CardPoolInfoApiDto, CardPoolInfoElk> {
    CardPoolInfoElk toEntity(CardPoolInfoApiDto CardPoolInfoApiDto);

}
