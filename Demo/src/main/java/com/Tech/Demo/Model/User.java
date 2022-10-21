package com.Tech.Demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	
    @Id
	private int Empid;
	
	private String FirstName;
	private String  Designation;
	
	public User() {
		
	}

	public User(int empid, String firstName, String designation) {
		super();
		Empid = empid;
		FirstName = firstName;
		Designation = designation;
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}
	
}
