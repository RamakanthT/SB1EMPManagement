package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.controller.EmpController;
import com.example.demo.model.EmpDeptTO;
import com.example.demo.model.EmpInsuranceTO;
import com.example.demo.model.EmpLoginTO;
import com.example.demo.model.EmpPersonalTO;
import com.example.demo.model.EmployeeTO;
import com.example.demo.objectfactory.EmployeeOF;
import com.example.demo.service.EmpDeptService;
import com.example.demo.service.EmpInsuranceService;
import com.example.demo.service.EmpPersonalService;
import com.example.demo.service.EmpService;

@Configuration
public class EmpBeanConfig {

	@Bean(value = "empController")
	//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
	@Scope(value = "prototype")
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.INTERFACES)
	public EmpController getEmpController() {
		EmpController empController = new EmpController();
		return empController;
	}
	
	@Bean(value = "empLoginTOObj")
	//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
	@Scope(value = "prototype")
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.INTERFACES)
	public EmpLoginTO getEmpLoginTOObj() {
		EmpLoginTO empLoginTOObj = new EmpLoginTO();
		return empLoginTOObj;
	}	
	
	public EmployeeOF getEmployeeOF() {
		return new EmployeeOF();
	}
	
	@Bean(value = "empTO")
	public EmployeeTO getEmployeeTO() {
		return getEmployeeOF().getEmpDeptObj();
	}
	
	/*
	 * @Bean(value = "empTO") //@Scope(value = WebApplicationContext.SCOPE_SESSION,
	 * proxyMode = ScopedProxyMode.TARGET_CLASS) @Scope(value = "prototype")
	 * //@Scope(value="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
	 * //@Scope(value="prototype",proxyMode = ScopedProxyMode.INTERFACES) public
	 * EmployeeTO getEmployeeTO() { EmployeeTO empTO = new EmployeeTO(); return
	 * empTO; }
	 */	
	
	@Bean(value = "empPersonalTO")
	//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
	@Scope(value = "prototype")
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.INTERFACES)
	public EmpPersonalTO getEmpPersonalTO() {
		EmpPersonalTO empPersonalTO = new EmpPersonalTO();
		return empPersonalTO;
	}
	
	@Bean(value = "empDeptTO")
	//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
	@Scope(value = "prototype")
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.INTERFACES)
	public EmpDeptTO getEmpDeptTO() {
		EmpDeptTO empDeptTO = new EmpDeptTO();
		return empDeptTO;
	}
	
	@Bean(value = "empInsuranceTO")
	//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
	@Scope(value = "prototype")
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.INTERFACES)
	public EmpInsuranceTO getEmpInsuranceTO() {
		EmpInsuranceTO empInsuranceTO = new EmpInsuranceTO();
		return empInsuranceTO;
	}
	
	@Bean(value = "empService")
	//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
	@Scope(value = "prototype")
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.INTERFACES)
	public EmpService getEmpService() {
		EmpService empService = new EmpService();
		return empService;
	}	
	
	@Bean(value = "empPersonalService")
	//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
	@Scope(value = "prototype")
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.INTERFACES)
	public EmpPersonalService getEmpPersonalService() {
		EmpPersonalService empPersonalService = new EmpPersonalService();
		return empPersonalService;
	}
	
	@Bean(value = "empDeptService")
	//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
	@Scope(value = "prototype")
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.INTERFACES)
	public EmpDeptService getEmpDeptService() {
		EmpDeptService empDeptService = new EmpDeptService();
		return empDeptService;
	}
	
	@Bean(value = "empInsuranceService")
	//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
	@Scope(value = "prototype")
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
	//@Scope(value="prototype",proxyMode = ScopedProxyMode.INTERFACES)
	public EmpInsuranceService getEmpInsuranceService() {
		EmpInsuranceService empInsuranceService = new EmpInsuranceService();
		return empInsuranceService;
	}
	
}
