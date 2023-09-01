package zaggle.xpns.elk.service.mapper;

import zaggle.xpns.elk.domain.Expense;
import zaggle.xpns.elk.service.dto.ExpenseApiDto;

import java.util.List;

public interface EntityMapper<D, E> {
    E toEntity(D dto);
    D toDto(E entity);
    List<E> toEntity(List<D> dtoList);
    List<D> toDto(List<E> entityList);


//    CardTxnApiDto toDto(CardTxnApiDto cardTxnApiDto);
}
