package com.hexaware.springannotations.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Service
//@Repository
//@Controller
@Scope("prototype")
public class Employee {
	private int eid;
	private String ename;
	public Employee()
	{
		
	}
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
