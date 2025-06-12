package com.dharbor.bootcamp.notificationpersistence.repository;

import com.dharbor.bootcamp.notificationpersistence.domain.Notification;
import com.dharbor.bootcamp.notificationpersistence.enums.ReadStatus;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;


public interface NotificationRepository extends MongoRepository<Notification, String> {
    Page<Notification> findByParticipantsUserIdAndParticipantsRead(@Param("userId") String userId,
                                                                   @Param("read") ReadStatus read,
                                                                   @Param("pageable") Pageable pageable);
}
