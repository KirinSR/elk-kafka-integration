package zaggle.xpns.elk.repository;


import zaggle.xpns.elk.domain.CardOrderElk;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableElasticsearchRepositories
public interface CardOrderElkRepository extends ElasticsearchRepository<CardOrderElk, Long> {
}
