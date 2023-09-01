package zaggle.xpns.elk.service.mapper;

import org.mapstruct.Mapper;
import zaggle.xpns.elk.domain.Card;
import zaggle.xpns.elk.domain.Employee;
import zaggle.xpns.elk.service.dto.CardApiDto;
import zaggle.xpns.elk.service.dto.EmployeeApiDto;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends EntityMapper<EmployeeApiDto, Employee>{
    Employee toEntity(EmployeeApiDto employeeApiDto);
}
