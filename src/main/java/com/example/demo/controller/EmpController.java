package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;

import com.example.demo.constant.EmpConstant;
import com.example.demo.model.EmpLoginTO;
import com.example.demo.service.EmpService;

public class EmpController {

	@Autowired
	EmpService empService;

	public Boolean empLoginValidate(EmpLoginTO empLoginTO, HttpServletRequest req, Model model) {

		Boolean retVal = empService.empLoginValidator(empLoginTO, req, model);
		return retVal;

	}

}
