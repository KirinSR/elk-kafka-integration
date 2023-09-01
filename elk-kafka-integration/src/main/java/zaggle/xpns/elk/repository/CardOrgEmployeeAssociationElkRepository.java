package zaggle.xpns.elk.repository;

import zaggle.xpns.elk.domain.CardOrgEmployeeAssociationElk;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Repository;


@Repository
@EnableElasticsearchRepositories
public interface CardOrgEmployeeAssociationElkRepository extends ElasticsearchRepository<CardOrgEmployeeAssociationElk, Long> {
}
