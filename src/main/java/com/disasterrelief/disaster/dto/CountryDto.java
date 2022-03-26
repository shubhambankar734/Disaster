package com.disasterrelief.disaster.dto;

import java.util.List;

import com.disasterrelief.disaster.entity.StateEntity;

public class CountryDto {

	private int countryId;
	private String countryName;
	private List<StateEntity> stateList;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countryId;
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + ((stateList == null) ? 0 : stateList.hashCode());
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
		CountryDto other = (CountryDto) obj;
		if (countryId != other.countryId)
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (stateList == null) {
			if (other.stateList != null)
				return false;
		} else if (!stateList.equals(other.stateList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CountryDto [countryId=" + countryId + ", countryName=" + countryName + ", stateList=" + stateList + "]";
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

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
