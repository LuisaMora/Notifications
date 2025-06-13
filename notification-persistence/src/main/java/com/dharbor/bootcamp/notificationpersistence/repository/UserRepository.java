package com.dharbor.bootcamp.notificationpersistence.repository;


import com.dharbor.bootcamp.notificationpersistence.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {

}
