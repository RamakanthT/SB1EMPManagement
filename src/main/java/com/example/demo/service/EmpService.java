package com.example.demo.service;

import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.example.demo.constant.EmpConstant;
import com.example.demo.model.EmpDeptTO;
import com.example.demo.model.EmpInsuranceTO;
import com.example.demo.model.EmpLoginTO;
import com.example.demo.model.EmpPersonalTO;
import com.example.demo.model.EmployeeTO;


public class EmpService {

	@Autowired
	EmployeeTO empTO;
	
	@Autowired
	EmpPersonalService empPersonalService;
	
	@Autowired
	EmpDeptService empDeptService;
	
	@Autowired
	EmpInsuranceService empInsuranceService;
	
	public Boolean empLoginValidator(EmpLoginTO empLoginTO, HttpServletRequest req, Model model) {

		if(req.getSession() == null) {
			return false;
		}
		HttpSession session = req.getSession();
		if ((empLoginTO.getUsername().equals(EmpConstant.EMP_USER1)
				&& empLoginTO.getPassword().equals(EmpConstant.EMP_PWD1))
				||(empLoginTO.getUsername().equals(EmpConstant.EMP_USER2)
						&& empLoginTO.getPassword().equals(EmpConstant.EMP_PWD2))
				||(empLoginTO.getUsername().equals(EmpConstant.EMP_USER3)
						&& empLoginTO.getPassword().equals(EmpConstant.EMP_PWD3))) {
			
			empTO.setEmpId(empLoginTO.getUsername());
			empTO.setEmpPwd(empLoginTO.getPassword());
			
			EmpPersonalTO empPersonalTO = empPersonalService.getEmpPersonalData(empTO);
			empTO.setEmpPersonalTO(empPersonalTO);
			try {
			    TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException ie) {
			    Thread.currentThread().interrupt();
			}
			EmpDeptTO empDeptTO = empDeptService.getEmpDeptData(empTO);
			empTO.setEmpDeptTO(empDeptTO);
			try {
			    TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException ie) {
			    Thread.currentThread().interrupt();
			}
			EmpInsuranceTO empInsuranceTO = empInsuranceService.getEmpInsuranceData(empTO);
			empTO.setEmpInsuranceTO(empInsuranceTO);
			
			model.addAttribute("empTO", empTO);
			session.setAttribute("empTO", empTO);			
			
			return true;
		} else {
			return false;
		}
		
		
	}

}
