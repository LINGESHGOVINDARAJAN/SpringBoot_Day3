package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeEntity;
import com.example.demo.repository.EmployeeRepo;
@Service
public class EmpoyeeService {
  @Autowired
  EmployeeRepo er;
  
  public EmployeeEntity saveinfo (EmployeeEntity ss)
  {
	  return er.save(ss);
  }
  public List<EmployeeEntity> showinfo(){
	  return er.findAll();
  }
}
