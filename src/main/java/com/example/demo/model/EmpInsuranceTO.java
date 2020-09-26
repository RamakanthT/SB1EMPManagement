package com.example.demo.model;

public class EmpInsuranceTO {

	private String empId;
	private String empPolicyId;
	private String empNominee;
	private String empPolicy;
	private String empPolicyAmt;
	
	public EmpInsuranceTO() {
		super();
	}
	
	public EmpInsuranceTO(String empId, String empPolicyId, String empNominee, String empPolicy, String empPolicyAmt) {
		super();
		this.empId = empId;
		this.empPolicyId = empPolicyId;
		this.empNominee = empNominee;
		this.empPolicy = empPolicy;
		this.empPolicyAmt = empPolicyAmt;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpPolicyId() {
		return empPolicyId;
	}

	public void setEmpPolicyId(String empPolicyId) {
		this.empPolicyId = empPolicyId;
	}

	public String getEmpNominee() {
		return empNominee;
	}

	public void setEmpNominee(String empNominee) {
		this.empNominee = empNominee;
	}

	public String getEmpPolicy() {
		return empPolicy;
	}

	public void setEmpPolicy(String empPolicy) {
		this.empPolicy = empPolicy;
	}

	public String getEmpPolicyAmt() {
		return empPolicyAmt;
	}

	public void setEmpPolicyAmt(String empPolicyAmt) {
		this.empPolicyAmt = empPolicyAmt;
	}
	
}
