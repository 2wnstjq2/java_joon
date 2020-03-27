package com.park.model;

import java.io.Serializable;

public class EmployeeVo implements Serializable{
	private static final long SerialVersionUID = 1L;
	
	private Integer id;
	private String fName;
	private String lName;
	
	//세터&게터
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public static long getSerialversionuid() {
		return SerialVersionUID;
	}
	@Override
	public String toString() {
		return "EmployeeVo [id=" + id + ", fName=" + fName + ", lName=" + lName + "]";
	}
	
	
	
}
