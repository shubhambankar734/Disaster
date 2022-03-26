package com.disasterrelief.disaster.entity;

import java.util.List;

import org.mongodb.morphia.annotations.Entity;


@Entity("countries")
public class CountryEntity extends BaseEntity{
	private String countryName;
	private List<StateEntity> stateList;
	
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<StateEntity> getStateList() {
		return stateList;
	}

	public void setStateList(List<StateEntity> stateList) {
		this.stateList = stateList;
	}


}
