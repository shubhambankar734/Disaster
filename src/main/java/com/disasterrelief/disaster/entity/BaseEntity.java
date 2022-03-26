package com.disasterrelief.disaster.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import org.mongodb.morphia.annotations.Id;


public class BaseEntity implements Serializable{
	@Id
	private String id;
	private static final long serialVersionUID = 1L;
	private String objectId=UUID.randomUUID().toString();
	private long createdAt=new Date().getTime();
	private long lastUpdated= new Date().getTime();
	
	public String getId() {
		return id;
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public long getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(long lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	
	
	
}
