package zaggle.xpns.elk.repository;

import zaggle.xpns.elk.domain.Card;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CardRepository extends ElasticsearchRepository<Card, Long> {

}
