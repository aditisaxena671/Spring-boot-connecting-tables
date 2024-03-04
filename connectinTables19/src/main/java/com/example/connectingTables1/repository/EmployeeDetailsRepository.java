package com.example.connectingTables1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.connectingTables1.entity.EmployeeDetails;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, String> {

}
