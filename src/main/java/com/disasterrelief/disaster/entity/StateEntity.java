package com.disasterrelief.disaster.entity;

import java.util.List;

import org.mongodb.morphia.annotations.Entity;

@Entity("states")
public class StateEntity extends BaseEntity{
	private String stateName;
	private List<CityEntity> cityList;
	private CountryEntity countryId;
	
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<CityEntity> getCityList() {
		return cityList;
	}

	public void setCityList(List<CityEntity> cityList) {
		this.cityList = cityList;
	}

	public CountryEntity getCountryId() {
		return countryId;
	}

	public void setCountryId(CountryEntity countryId) {
		this.countryId = countryId;
	}

}
