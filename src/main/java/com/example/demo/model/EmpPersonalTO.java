package com.example.demo.model;

public class EmpPersonalTO {

	private String empId;
	private String empFirstName;
	private String empLastName;
	private String empDob;
	private String empPhone;
	
	public EmpPersonalTO() {
		super();
	}
	
	public EmpPersonalTO(String empId, String empFirstName, String empLastName, String empDob, String empPhone) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empDob = empDob;
		this.empPhone = empPhone;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpDob() {
		return empDob;
	}

	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	
}
