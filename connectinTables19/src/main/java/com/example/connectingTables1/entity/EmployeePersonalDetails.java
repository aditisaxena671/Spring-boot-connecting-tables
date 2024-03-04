package com.example.connectingTables1.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class EmployeePersonalDetails {

	
	public EmployeePersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private String personalDetailId;
	private String dob;
	private String gender;
	private String maritialStatus;
	private String maritialDate;
	private String mobNumber;
	private String name;
	private String validityPeriod;
	
	
	@OneToOne(mappedBy = "employeePersonalDetails")
	private EmployeeDetails details;
	
	
	public EmployeePersonalDetails(String personalDetailId, String dob, String gender, String maritialStatus,
			String maritialDate, String mobNumber, String name, String validityPeriod) {
		super();
		this.personalDetailId = personalDetailId;
		this.dob = dob;
		this.gender = gender;
		this.maritialStatus = maritialStatus;
		this.maritialDate = maritialDate;
		this.mobNumber = mobNumber;
		this.name = name;
		this.validityPeriod = validityPeriod;
	}

	public String getPersonalDetailId() {
		return personalDetailId;
	}

	public void setPersonalDetailId(String personalDetailId) {
		this.personalDetailId = personalDetailId;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritialStatus() {
		return maritialStatus;
	}

	public void setMaritialStatus(String maritialStatus) {
		this.maritialStatus = maritialStatus;
	}

	public String getMaritialDate() {
		return maritialDate;
	}

	public void setMaritialDate(String maritialDate) {
		this.maritialDate = maritialDate;
	}

	public String getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}
	
}
