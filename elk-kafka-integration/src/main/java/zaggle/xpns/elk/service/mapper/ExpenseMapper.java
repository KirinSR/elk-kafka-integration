package zaggle.xpns.elk.service.mapper;
import org.mapstruct.Mapper;
import zaggle.xpns.elk.domain.Employee;
import zaggle.xpns.elk.domain.Expense;
import zaggle.xpns.elk.service.dto.EmployeeApiDto;
import zaggle.xpns.elk.service.dto.ExpenseApiDto;
@Mapper(componentModel = "spring")
public interface ExpenseMapper extends EntityMapper<ExpenseApiDto, Expense>{
    Expense toEntity(ExpenseApiDto expenseApiDto);
}