package com.example.connectingTables1.entity;

import org.hibernate.annotations.MapKeyCompositeType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PolicyNumberTable {

	public PolicyNumberTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private String policyNumberId;
	private String addedDate;
	private String name;
	private String relationshipType;
	
//	@ManyToOne
//	@JoinColumn(name = "enrolmentID", referencedColumnName = "enrolmentID")
//	private EnrolmentTable enrolmentTable;
	
	@ManyToOne
	@JoinColumn(name = "enrolmentID", referencedColumnName = "enrolmentID")
	private EnrolmentTable enrolmentTable;
	
	public PolicyNumberTable(String policyNumberId, String addedDate, String name, String relationshipType) {
		super();
		this.policyNumberId = policyNumberId;
		this.addedDate = addedDate;
		this.name = name;
		this.relationshipType = relationshipType;
	}
	public String getPolicyNumberId() {
		return policyNumberId;
	}
	public void setPolicyNumberId(String policyNumberId) {
		this.policyNumberId = policyNumberId;
	}
	public String getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}
	
	
}
