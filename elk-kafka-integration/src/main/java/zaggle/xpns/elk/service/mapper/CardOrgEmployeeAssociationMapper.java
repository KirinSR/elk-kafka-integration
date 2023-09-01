package zaggle.xpns.elk.service.mapper;

import zaggle.xpns.elk.domain.CardOrgEmployeeAssociationElk;
import zaggle.xpns.elk.service.dto.CardOrgEmployeeAssociationApiDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardOrgEmployeeAssociationMapper extends EntityMapper<CardOrgEmployeeAssociationApiDto, CardOrgEmployeeAssociationElk>{

    CardOrgEmployeeAssociationElk toEntity(CardOrgEmployeeAssociationApiDto cardOrgEmployeeAssociationApiDto);
}
