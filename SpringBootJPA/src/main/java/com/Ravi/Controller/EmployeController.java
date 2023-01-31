package com.Ravi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping("/save")
	public Employe save( @RequestBody Employe employe) {
		return employeService.save(employe);
	}
	@PutMapping("/update")
	public Employe update( @RequestBody Employe employe) {
		return employeService.update(employe);
	}
	@GetMapping("/findById/{eid}")
	public Employe findById(@PathVariable Integer  eid) {
		return employeService.findById(eid);
		
	}
	@DeleteMapping("/delete/{eid}")
	public void DeleteById(@PathVariable Integer eid) {
		employeService.DeleteById(eid);
	}
}
