package com.example.connectingTables1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.connectingTables1.entity.PolicyNumberTable;

public interface PolicyNumberRepository extends JpaRepository<PolicyNumberTable, String> {

}
