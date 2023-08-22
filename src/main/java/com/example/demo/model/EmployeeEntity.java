package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeetable")
public class EmployeeEntity {
@Id
@GeneratedValue
	private int eid;
	private String eName;
	private int eAge;
	private long esalary;
	public EmployeeEntity(int eid, String eName, int eAge, long esalary) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.eAge = eAge;
		this.esalary = esalary;
		
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	public long getEsalary() {
		return esalary;
	}
	public void setEsalary(long esalary) {
		this.esalary = esalary;
	}
	
}
