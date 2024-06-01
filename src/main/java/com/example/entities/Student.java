package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int univId;
	String name;
	String email;
	String branch;
	String address;
	public Student() {
		super();
	}
	public Student (int univId, String name, String email, String branch, String address) {
		super();
		this.univId=univId;
		this.name=name;
		this.email=email;
		this.branch=branch; 
		this.address=address;
	}
	public int  getUnivId() {
		return univId;
	}
}
