package com.dharbor.bootcamp.notificationpersistence.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Setter
@Getter
@Document("user")
public class User {

    @Id
    private String id;

    @Field("username")
    private String name;

}
