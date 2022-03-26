package com.disasterrelief.disaster.dto;

import java.util.List;

import com.disasterrelief.disaster.entity.CityEntity;

public class StateDto {

	private int stateId;
	private String stateName;
	private List<CityEntity> cityList;
	private int countryId;

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

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

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityList == null) ? 0 : cityList.hashCode());
		result = prime * result + countryId;
		result = prime * result + stateId;
		result = prime * result + ((stateName == null) ? 0 : stateName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StateDto other = (StateDto) obj;
		if (cityList == null) {
			if (other.cityList != null)
				return false;
		} else if (!cityList.equals(other.cityList))
			return false;
		if (countryId != other.countryId)
			return false;
		if (stateId != other.stateId)
			return false;
		if (stateName == null) {
			if (other.stateName != null)
				return false;
		} else if (!stateName.equals(other.stateName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StateDto [stateId=" + stateId + ", stateName=" + stateName + ", cityList=" + cityList + ", countryId="
				+ countryId + "]";
	}

}
