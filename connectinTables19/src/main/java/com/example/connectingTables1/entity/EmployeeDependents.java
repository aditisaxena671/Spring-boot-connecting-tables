package com.example.connectingTables1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EmployeeDependents {
	
	
	public EmployeeDependents() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id	
	private String dependentID;
	private String addedDate;
	private String adoptionDate;
	private String dob;
	private boolean disability;
	private String effectiveDate;
	private String gender;
	private String name;
	private String relationship;
	private String validityPeriod;
	
//	@ManyToOne
//	@Column(name = "employeeId")
//	private String employeeId;
	
	
	@ManyToOne
	@JoinColumn(name = "employeeId", referencedColumnName = "employeeId")
	private EmployeeDetails employeeDetails;



	
	public EmployeeDependents(String dependentID, String addedDate, String adoptionDate, String dob, boolean disability,
			String effectiveDate, String gender, String name, String relationship, String validityPeriod) {
		super();
		this.dependentID = dependentID;
		this.addedDate = addedDate;
		this.adoptionDate = adoptionDate;
		this.dob = dob;
		this.disability = disability;
		this.effectiveDate = effectiveDate;
		this.gender = gender;
		this.name = name;
		this.relationship = relationship;
		this.validityPeriod = validityPeriod;
	}


	public String getDependentID() {
		return dependentID;
	}


	public void setDependentID(String dependentID) {
		this.dependentID = dependentID;
	}


	public String getAddedDate() {
		return addedDate;
	}


	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}


	public String getAdoptionDate() {
		return adoptionDate;
	}


	public void setAdoptionDate(String adoptionDate) {
		this.adoptionDate = adoptionDate;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public boolean isDisability() {
		return disability;
	}


	public void setDisability(boolean disability) {
		this.disability = disability;
	}


	public String getEffectiveDate() {
		return effectiveDate;
	}


	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRelationship() {
		return relationship;
	}


	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}


	public String getValidityPeriod() {
		return validityPeriod;
	}


	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}
	
	
}
