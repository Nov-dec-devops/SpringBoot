package com.Ravi.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tab")
public class Employe {
    @Id
	private int eid;
	private String ename;
	private double esal;
	
	public Employe() {
		// TODO Auto-generated constructor stub
	}

	public Employe(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
}
