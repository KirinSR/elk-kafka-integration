package zaggle.xpns.elk.repository;


import zaggle.xpns.elk.domain.CardPoolInfoElk;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableElasticsearchRepositories
public interface CardPoolInfoElkRepository extends ElasticsearchRepository<CardPoolInfoElk, Long> {
}
