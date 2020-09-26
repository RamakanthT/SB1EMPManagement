package com.example.demo.model;

public class EmpDeptTO {

	private String empId;
	private String empDeptNo;
	private String empDeptName;
	private String empDeptCategory;
	private String empDeptLocation;
	
	public EmpDeptTO() {
		super();
	}
	
	public EmpDeptTO(String empId, String empDeptNo, String empDeptName, String empDeptCategory,
			String empDeptLocation) {
		super();
		this.empId = empId;
		this.empDeptNo = empDeptNo;
		this.empDeptName = empDeptName;
		this.empDeptCategory = empDeptCategory;
		this.empDeptLocation = empDeptLocation;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpDeptNo() {
		return empDeptNo;
	}

	public void setEmpDeptNo(String empDeptNo) {
		this.empDeptNo = empDeptNo;
	}

	public String getEmpDeptName() {
		return empDeptName;
	}

	public void setEmpDeptName(String empDeptName) {
		this.empDeptName = empDeptName;
	}

	public String getEmpDeptCategory() {
		return empDeptCategory;
	}

	public void setEmpDeptCategory(String empDeptCategory) {
		this.empDeptCategory = empDeptCategory;
	}

	public String getEmpDeptLocation() {
		return empDeptLocation;
	}

	public void setEmpDeptLocation(String empDeptLocation) {
		this.empDeptLocation = empDeptLocation;
	}
	
}
