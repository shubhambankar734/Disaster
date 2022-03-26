package com.disasterrelief.disaster.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "StateEntity")
public class StateEntity {

	@Id
	private int stateId;
	private String stateName;
	private List<CityEntity> cityList;
	private CountryEntity countryId;

	@Override
	public String toString() {
		return "StateEntity [stateId=" + stateId + ", stateName=" + stateName + ", countryId=" + countryId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityList == null) ? 0 : cityList.hashCode());
		result = prime * result + ((countryId == null) ? 0 : countryId.hashCode());
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
		StateEntity other = (StateEntity) obj;
		if (cityList == null) {
			if (other.cityList != null)
				return false;
		} else if (!cityList.equals(other.cityList))
			return false;
		if (countryId == null) {
			if (other.countryId != null)
				return false;
		} else if (!countryId.equals(other.countryId))
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

	public CountryEntity getCountryId() {
		return countryId;
	}

	public void setCountryId(CountryEntity countryId) {
		this.countryId = countryId;
	}

}
