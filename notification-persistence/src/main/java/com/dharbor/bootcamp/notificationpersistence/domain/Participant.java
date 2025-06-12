package com.dharbor.bootcamp.notificationpersistence.domain;

import com.dharbor.bootcamp.notificationpersistence.enums.ReadStatus;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Participant {

    private String userId;

    private ReadStatus read;
}
