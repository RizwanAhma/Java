package com.hibernate;

import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="student")
public class Entity {
	
	@Id
	private int id;
	private String name;
	private String lName;
	private String salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	

}
