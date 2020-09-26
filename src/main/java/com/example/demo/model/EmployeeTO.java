package com.example.demo.model;

public class EmployeeTO {

	private String empId;
	private String empPwd;
	private EmpPersonalTO empPersonalTO;
	private EmpDeptTO empDeptTO;
	private EmpInsuranceTO empInsuranceTO;
	
	public EmployeeTO() {
		super();		
	}
	
	public EmployeeTO(String empId, String empPwd, EmpPersonalTO empPersonalTO, EmpDeptTO empDeptTO,
			EmpInsuranceTO empInsuranceTO) {
		super();
		this.empId = empId;
		this.empPwd = empPwd;
		this.empPersonalTO = empPersonalTO;
		this.empDeptTO = empDeptTO;
		this.empInsuranceTO = empInsuranceTO;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpPwd() {
		return empPwd;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}

	public EmpPersonalTO getEmpPersonalTO() {
		return empPersonalTO;
	}

	public void setEmpPersonalTO(EmpPersonalTO empPersonalTO) {
		this.empPersonalTO = empPersonalTO;
	}

	public EmpDeptTO getEmpDeptTO() {
		return empDeptTO;
	}

	public void setEmpDeptTO(EmpDeptTO empDeptTO) {
		this.empDeptTO = empDeptTO;
	}

	public EmpInsuranceTO getEmpInsuranceTO() {
		return empInsuranceTO;
	}

	public void setEmpInsuranceTO(EmpInsuranceTO empInsuranceTO) {
		this.empInsuranceTO = empInsuranceTO;
	}
	
}
