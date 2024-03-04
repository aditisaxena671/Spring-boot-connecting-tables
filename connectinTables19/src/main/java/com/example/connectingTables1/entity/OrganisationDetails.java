package com.example.connectingTables1.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class OrganisationDetails {
	
	public OrganisationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private String orgId;
	private String company;
	private String companyCode;
	private String costCenter;
	private String ctc;
	private String grade;
	private String location;
	private String validityPeriod;
	
//	@OneToOne(mappedBy = "orgEmployee")
//	private EmployeeDependents employeeDependents;
	
	public OrganisationDetails(String orgId, String company, String companyCode, String costCenter, String ctc,
			String grade, String location, String validityPeriod) {
		super();
		this.orgId = orgId;
		this.company = company;
		this.companyCode = companyCode;
		this.costCenter = costCenter;
		this.ctc = ctc;
		this.grade = grade;
		this.location = location;
		this.validityPeriod = validityPeriod;
	}
	
	@OneToOne(mappedBy = "organisationDetails")
	private EmployeeDetails organisationEmployeeDetails;
	
	
	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getCtc() {
		return ctc;
	}

	public void setCtc(String ctc) {
		this.ctc = ctc;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	
	

}
