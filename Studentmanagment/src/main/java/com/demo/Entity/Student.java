package com.demo.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	
	
    private int studid;

	
    private String studname;
	
	
    private int  studage;


	public Student() {
		super();
		
	}


	public Student(int studid, String studname, int studage) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.studage = studage;
	}


	public int getStudid() {
		return studid;
	}


	public void setStudid(int studid) {
		this.studid = studid;
	}


	public String getStudname() {
		return studname;
	}


	public void setStudname(String studname) {
		this.studname = studname;
	}


	public int getStudage() {
		return studage;
	}


	public void setStudage(int studage) {
		this.studage = studage;
	}


	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studname=" + studname + ", studage=" + studage + "]";
	}
	
	

	
	
}