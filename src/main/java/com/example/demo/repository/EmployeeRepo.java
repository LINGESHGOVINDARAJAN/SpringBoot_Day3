package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EmployeeEntity;

public interface EmployeeRepo  extends JpaRepository<EmployeeEntity, Integer>{

}
