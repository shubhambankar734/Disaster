package com.disasterrelief.disaster.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.disasterrelief.disaster.entity.CityEntity;

@Repository
public interface CityRepository extends MongoRepository<CityEntity, Integer> {

}
