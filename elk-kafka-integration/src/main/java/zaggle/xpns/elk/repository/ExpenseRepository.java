package zaggle.xpns.elk.repository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import zaggle.xpns.elk.domain.Expense;
public interface ExpenseRepository extends ElasticsearchRepository<Expense, Long> {
}