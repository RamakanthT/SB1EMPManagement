package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.constant.EmpConstant;
import com.example.demo.model.EmpPersonalTO;
import com.example.demo.model.EmployeeTO;

public class EmpPersonalService {

	@Autowired
	EmpPersonalTO empPersonalTO;
	
	public EmpPersonalTO getEmpPersonalData(EmployeeTO empTO) {
	
		return getPersonalDetailsByEmpId(empTO.getEmpId());
		
	}

	private EmpPersonalTO getPersonalDetailsByEmpId(String empId) {
		
		if(empId != null && empId.equalsIgnoreCase(EmpConstant.EMP_USER1)) {
			empPersonalTO.setEmpId(empId);
			empPersonalTO.setEmpFirstName("UserF1");
			empPersonalTO.setEmpLastName("UserL1");
			empPersonalTO.setEmpDob("dob1");
			empPersonalTO.setEmpPhone("phone1");
		}else if(empId != null && empId.equalsIgnoreCase(EmpConstant.EMP_USER2)) {
			empPersonalTO.setEmpId(empId);
			empPersonalTO.setEmpFirstName("UserF2");
			empPersonalTO.setEmpLastName("UserL2");
			empPersonalTO.setEmpDob("dob2");
			empPersonalTO.setEmpPhone("phone2");
		}else if(empId != null && empId.equalsIgnoreCase(EmpConstant.EMP_USER3)) {
			empPersonalTO.setEmpId(empId);
			empPersonalTO.setEmpFirstName("UserF3");
			empPersonalTO.setEmpLastName("UserL3");
			empPersonalTO.setEmpDob("dob3");
			empPersonalTO.setEmpPhone("phone3");
		}
		
		return empPersonalTO;
	}

}
