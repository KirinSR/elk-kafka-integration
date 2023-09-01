package zaggle.xpns.elk.service.mapper;

import zaggle.xpns.elk.domain.CardTransactionElk;
import zaggle.xpns.elk.service.dto.CardTxnApiDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardTransactionElkMapper extends EntityMapper<CardTxnApiDto, CardTransactionElk>{
    CardTransactionElk toEntity(CardTxnApiDto cardTxnApiDto);

}
