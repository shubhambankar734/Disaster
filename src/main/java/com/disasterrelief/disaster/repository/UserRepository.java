package com.disasterrelief.disaster.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.disasterrelief.disaster.entity.UserEntity;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, Integer> {

}
