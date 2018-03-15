package com.hydra.sbmr.repoMongo;

import com.hydra.sbmr.model.Folder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FolderMongoRepository extends MongoRepository<Folder, String> {

}
