package com.hydra.sbmr.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@org.springframework.data.mongodb.core.mapping.Document(collection = "profile")
public class Profile {

    @Id
    @Getter @Setter private String id;

    @Getter @Setter String blah;

}
