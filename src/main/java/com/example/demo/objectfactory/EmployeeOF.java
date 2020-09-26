package com.example.demo.objectfactory;

import com.example.demo.model.EmployeeTO;

public class EmployeeOF {

	public EmployeeTO getEmpDeptObj() {
		return new EmployeeTO();
	}
}
