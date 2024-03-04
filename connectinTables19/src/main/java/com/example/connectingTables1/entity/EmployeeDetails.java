package com.example.connectingTables1.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class EmployeeDetails {
	
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	private String employeeId;
	private String dateOfJoin;
	private String email;
	private String status;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name= "personalDetailsId", referencedColumnName = "personalDetailId")
//	private EmployeePersonalDetails employeePersonalDetails;
//	
//	@OneToMany(mappedBy = "employeeDetails", cascade = CascadeType.ALL)
//	private List<EmployeeDependents> employeeDependents;
//	
//	@OneToMany(mappedBy = "enrolmentEmployeeDetails", cascade = CascadeType.ALL)
//	private List<EnrolmentTable> enrolmentTables;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "orgId", referencedColumnName = "orgId")
//	private OrganisationDetails organisationDetails;
	

	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personalDetailsId", referencedColumnName = "personalDetailId")
    private EmployeePersonalDetails employeePersonalDetails;
    
    @OneToMany(mappedBy = "employeeDetails", cascade = CascadeType.ALL)
    private List<EmployeeDependents> employeeDependents;
    
    @OneToMany(mappedBy = "enrolmentEmployeeDetails", cascade = CascadeType.ALL)
    private List<EnrolmentTable> enrolmentTables;

    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orgId", referencedColumnName = "orgId")
    private OrganisationDetails organisationDetails;

	
	
	
	
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "personalDetailId", referencedColumnName = "personalDetailId")
//	private EmployeePersonalDetails personalDetails;
	
//	@OneToMany(mappedBy = "employeeDetails",cascade= CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name = "employeeId", referencedColumnName = "dependentID")
//	private List<EmployeeDependents> dependent;
	
//	@OneToMany(mappedBy = "employeeDetails", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private List<EmployeeDependents> dependents;

//	@OneToMany(mappedBy = "employeeDetails", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private List<EnrolmentTable> enrolmentTable;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "employeeDependents", referencedColumnName = "orgId")
//	private OrganisationDetails organisationDetails;
//	
	public EmployeeDetails(String employeeId, String dateOfJoin, String email, String status) {
		super();
		this.employeeId = employeeId;
		this.dateOfJoin = dateOfJoin;
		this.email = email;
		this.status = status;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
