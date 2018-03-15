package com.hydra.sbmr.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

@org.springframework.data.mongodb.core.mapping.Document(collection = "folder")
@org.springframework.data.elasticsearch.annotations.Document(indexName = "folder")
public class Folder {

    @Id
    @Getter @Setter private String id;

    // Why MongoDB core mapping @DBRef causes java.lang.IllegalStateException: No association found! exception
    // while ElasticRepository creation???
    @DBRef
    @Getter @Setter private Profile profile;

    @Getter @Setter private String something;

}