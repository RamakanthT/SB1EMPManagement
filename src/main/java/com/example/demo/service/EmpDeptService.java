package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.constant.EmpConstant;
import com.example.demo.model.EmpDeptTO;
import com.example.demo.model.EmployeeTO;

public class EmpDeptService {

	@Autowired
	EmpDeptTO empDeptTO;
	
	public EmpDeptTO getEmpDeptData(EmployeeTO empTO) {
		return getDeptDataByEmpId(empTO.getEmpId());
	}

	private EmpDeptTO getDeptDataByEmpId(String empId) {
		
		if(empId != null && empId.equalsIgnoreCase(EmpConstant.EMP_USER1)) {
			empDeptTO.setEmpId(empId);
			empDeptTO.setEmpDeptNo("Dept1");
			empDeptTO.setEmpDeptName("DeptName1");
			empDeptTO.setEmpDeptCategory("DeptCateg1");
			empDeptTO.setEmpDeptLocation("DeptLoc1");
		}else if(empId != null && empId.equalsIgnoreCase(EmpConstant.EMP_USER2)) {
			empDeptTO.setEmpId(empId);
			empDeptTO.setEmpDeptNo("Dept2");
			empDeptTO.setEmpDeptName("DeptName2");
			empDeptTO.setEmpDeptCategory("DeptCateg2");
			empDeptTO.setEmpDeptLocation("DeptLoc2");
		}else if(empId != null && empId.equalsIgnoreCase(EmpConstant.EMP_USER3)) {
			empDeptTO.setEmpId(empId);
			empDeptTO.setEmpDeptNo("Dept3");
			empDeptTO.setEmpDeptName("DeptName3");
			empDeptTO.setEmpDeptCategory("DeptCateg3");
			empDeptTO.setEmpDeptLocation("DeptLoc3");
		}
		
		return empDeptTO;
	}

}
