package com.hydra.sbmr.repoElastic;

import com.hydra.sbmr.model.Folder;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface FolderElasticRepository extends ElasticsearchRepository<Folder, String> {

}
