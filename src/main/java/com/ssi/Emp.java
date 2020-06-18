package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {	
	@Id
	private int eno;
	private String ename;
	private int sal;
	private String desg;
	
	
	public Emp() {
		super();
	}
	public Emp(int eno, String ename, int sal, String desg) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.desg = desg;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	
	
	
}
