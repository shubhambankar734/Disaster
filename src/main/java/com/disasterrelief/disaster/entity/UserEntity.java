package com.disasterrelief.disaster.entity;

import org.mongodb.morphia.annotations.Entity;

import com.disasterrelief.disaster.UserType;
@Entity("users")
public class UserEntity extends BaseEntity{

	private static final long serialVersionUID = 8484028561368492736L;
	private String userName;
	private String email;
	private String mobileNo;
	private UserType type;
	private CountryEntity countryId;
	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public CountryEntity getCountryId() {
		return countryId;
	}

	public void setCountryId(CountryEntity countryId) {
		this.countryId = countryId;
	}

}
