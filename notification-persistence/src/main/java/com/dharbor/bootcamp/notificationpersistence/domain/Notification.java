package com.dharbor.bootcamp.notificationpersistence.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Document("notification")
public class Notification {
    @Id
    private String id;

    private String title;

    private String message;

    private Date createdDate;

    @DBRef
    private User user;
    private List<Participant> participants;

}
