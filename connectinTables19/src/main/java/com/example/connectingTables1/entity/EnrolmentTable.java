package com.example.connectingTables1.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class EnrolmentTable {

	public EnrolmentTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private String enrolmentID;
	private String applicableYear;
	private String basePlanType;
	private String createdBy;
	private String deduction;
	private String effectivePeriod;
	private String planOpted;
	private String policyOpted;
	private String premium;
	private String emi;
	private String startDate;
	private String status;
	private String subType;
	private String sumEnsured;
	private String updatedBy;
	private String updatedOn;
	
	public EnrolmentTable(String enrolmentID, String applicableYear, String basePlanType, String createdBy,
			String deduction, String effectivePeriod, String planOpted, String policyOpted, String premium, String emi,
			String startDate, String status, String subType, String sumEnsured, String updatedBy, String updatedOn) {
		super();
		this.enrolmentID = enrolmentID;
		this.applicableYear = applicableYear;
		this.basePlanType = basePlanType;
		this.createdBy = createdBy;
		this.deduction = deduction;
		this.effectivePeriod = effectivePeriod;
		this.planOpted = planOpted;
		this.policyOpted = policyOpted;
		this.premium = premium;
		this.emi = emi;
		this.startDate = startDate;
		this.status = status;
		this.subType = subType;
		this.sumEnsured = sumEnsured;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}
	
	@ManyToOne
	@JoinColumn(name = "employee", referencedColumnName = "employeeId")
	private EmployeeDetails enrolmentEmployeeDetails;
	
	
	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy ="enrolmentTable" )
//	private List<PolicyNumberTable> policyNumberTables;
//	@JoinColumn(referencedColumnName = "policyNumberId")
	
	@OneToMany(mappedBy = "enrolmentTable",cascade = CascadeType.ALL)
	private List<PolicyNumberTable> policyNumberTables;
	
	public String getEnrolmentID() {
		return enrolmentID;
	}

	public void setEnrolmentID(String enrolmentID) {
		this.enrolmentID = enrolmentID;
	}

	public String getApplicableYear() {
		return applicableYear;
	}

	public void setApplicableYear(String applicableYear) {
		this.applicableYear = applicableYear;
	}

	public String getBasePlanType() {
		return basePlanType;
	}

	public void setBasePlanType(String basePlanType) {
		this.basePlanType = basePlanType;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDeduction() {
		return deduction;
	}

	public void setDeduction(String deduction) {
		this.deduction = deduction;
	}

	public String getEffectivePeriod() {
		return effectivePeriod;
	}

	public void setEffectivePeriod(String effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
	}

	public String getPlanOpted() {
		return planOpted;
	}

	public void setPlanOpted(String planOpted) {
		this.planOpted = planOpted;
	}

	public String getPolicyOpted() {
		return policyOpted;
	}

	public void setPolicyOpted(String policyOpted) {
		this.policyOpted = policyOpted;
	}

	public String getPremium() {
		return premium;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getEmi() {
		return emi;
	}

	public void setEmi(String emi) {
		this.emi = emi;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getSumEnsured() {
		return sumEnsured;
	}

	public void setSumEnsured(String sumEnsured) {
		this.sumEnsured = sumEnsured;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
	
}
