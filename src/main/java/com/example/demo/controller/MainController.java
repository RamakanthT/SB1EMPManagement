package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.model.EmpLoginTO;

@Controller
@RequestMapping("/main")
//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MainController {
	
	@Autowired
	EmpController empController;
	
	@Autowired
	EmpLoginTO empLoginTOObj;

	@RequestMapping(value = "/empLogin", method = RequestMethod.POST )
	public String empLogin(@ModelAttribute EmpLoginTO empLoginTO, HttpServletRequest req, Model model) {
		
		System.out.println(empLoginTO.getUsername());
		Boolean retValidated = empController.empLoginValidate(empLoginTO, req, model);
		if(retValidated) {
			return "EmpMainPage";
		}
		return "ErrorPage";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET )
	public String login(HttpServletRequest req, Model model) {	
		model.addAttribute("empLoginTo",empLoginTOObj);
		return "EmpLogin";
	}
	
}
