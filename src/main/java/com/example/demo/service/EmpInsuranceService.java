package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.constant.EmpConstant;
import com.example.demo.model.EmpInsuranceTO;
import com.example.demo.model.EmployeeTO;

public class EmpInsuranceService {

	@Autowired
	EmpInsuranceTO empInsuranceTO;
	
	public EmpInsuranceTO getEmpInsuranceData(EmployeeTO empTO) {
		return getEmpInsuranceDataByEmpId(empTO.getEmpId());
	}

	private EmpInsuranceTO getEmpInsuranceDataByEmpId(String empId) {
		
		if(empId != null && empId.equalsIgnoreCase(EmpConstant.EMP_USER1)) {
			empInsuranceTO.setEmpId(empId);
			empInsuranceTO.setEmpPolicyId("empPol1");
			empInsuranceTO.setEmpPolicy("empPolName1");
			empInsuranceTO.setEmpPolicyAmt("empPolAmt1");
			empInsuranceTO.setEmpNominee("empNominee1");
		}else if(empId != null && empId.equalsIgnoreCase(EmpConstant.EMP_USER2)) {
			empInsuranceTO.setEmpId(empId);
			empInsuranceTO.setEmpPolicyId("empPol2");
			empInsuranceTO.setEmpPolicy("empPolName2");
			empInsuranceTO.setEmpPolicyAmt("empPolAmt2");
			empInsuranceTO.setEmpNominee("empNominee2");
		}else if(empId != null && empId.equalsIgnoreCase(EmpConstant.EMP_USER3)) {
			empInsuranceTO.setEmpId(empId);
			empInsuranceTO.setEmpPolicyId("empPol3");
			empInsuranceTO.setEmpPolicy("empPolName3");
			empInsuranceTO.setEmpPolicyAmt("empPolAmt3");
			empInsuranceTO.setEmpNominee("empNominee3");
		}
		
		return empInsuranceTO;
	}

}
