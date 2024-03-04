package com.example.connectingTables1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.connectingTables1.entity.EmployeeDependents;

public interface EmployeeDependentsRepository extends JpaRepository<EmployeeDependents, String> {

}
