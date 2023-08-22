package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeEntity;
import com.example.demo.service.EmpoyeeService;

@RestController

public class EmployeeController {
@Autowired
EmpoyeeService esr;
@PostMapping("addemployee")
public EmployeeEntity add(@RequestBody EmployeeEntity ss)
{
	return esr.saveinfo(ss);
}
@GetMapping("showres")
public List<EmployeeEntity> show()
{
	return esr.showinfo();
}
}
