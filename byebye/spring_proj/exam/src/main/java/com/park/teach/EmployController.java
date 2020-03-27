package com.park.teach;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.park.service.EmployeeManager;

@Controller
@RequestMapping("/employee-module")
public class EmployController {

	private static final Logger logger = LoggerFactory.getLogger(EmployController.class);

	@Autowired
	EmployeeManager manager;

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		model.addAttribute("employees", manager.getAllEmployees());
		return "employeesListDisplay";
	}
}
