package com.disasterrelief.disaster.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CountryEntity")
public class CountryEntity {
	@Id
	private int countryId;
	private String countryName;
	private List<StateEntity> stateList;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countryId;
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
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
		CountryEntity other = (CountryEntity) obj;
		if (countryId != other.countryId)
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CountryEntity [countryId=" + countryId + ", countryName=" + countryName + "]";
	}

}
