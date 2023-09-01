package zaggle.xpns.elk.repository;

import zaggle.xpns.elk.domain.CardInventoryElk;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardInventoryElkRepository extends ElasticsearchRepository<CardInventoryElk, Long> {
}
