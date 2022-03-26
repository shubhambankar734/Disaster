package com.disasterrelief.disaster.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.disasterrelief.disaster.entity.CountryEntity;

@Repository
public interface CountryRepository extends MongoRepository<CountryEntity, Integer> {

}
