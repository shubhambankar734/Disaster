package com.disasterrelief.disaster.dao;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;

import com.disasterrelief.disaster.entity.UserEntity;
import com.disasterrelief.disaster.mongo.LocaliteMongoConfig;

public class ManageUserDao {
	private static final Datastore ds= LocaliteMongoConfig.getMongo();
	public boolean save(UserEntity userEn) {
		return ds.save(userEn).getId()!= null;
	}
	
	public UserEntity getUserById(String id) {
		Query<UserEntity> userQuery= ds.createQuery(UserEntity.class);
		return userQuery.field("objectId").equal(id).get();
	}
	
	public List<UserEntity> getUserByIds(List<String> ids) {
		Query<UserEntity> userQuery= ds.createQuery(UserEntity.class);
		return userQuery.field("objectId").in(ids).asList();
	}
	
	public List<UserEntity> searchByName(String name) {
		Query<UserEntity> userQuery= ds.createQuery(UserEntity.class);
		return userQuery.field("userName").contains(name).asList();
	}
	public List<UserEntity> searchByMobile(String mobile) {
		Query<UserEntity> userQuery= ds.createQuery(UserEntity.class);
		return userQuery.field("mobileNo").equal(mobile).asList();
	}
	
	public List<UserEntity> searchByEmail(String email) {
		Query<UserEntity> userQuery= ds.createQuery(UserEntity.class);
		return userQuery.field("email").equal(email).asList();
	}
}
