package com.Ravi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ravi.Model.Employe;
import com.Ravi.Service.EmployeService;

@RestController
public class EmployeController {
	@Autowired
private EmployeService employeService;
	
	@GetMapping("/findAll")
	public List<Employe> employes(){
		return employeService.FindAll();
	}
}
