package com.disasterrelief.disaster.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CityEntity")
public class CityEntity extends BaseEntity{

	private static final long serialVersionUID = 371502971622685430L;
	private String cityName;
	private String stateId;
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	


}
