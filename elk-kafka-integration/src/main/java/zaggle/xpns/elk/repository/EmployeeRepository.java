package zaggle.xpns.elk.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import zaggle.xpns.elk.domain.Employee;

public interface EmployeeRepository extends ElasticsearchRepository<Employee, Long> {
}
