package com.Ravi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Ravi.Model.Employee;
import com.Ravi.Service.EmpService;

@Controller
public class EmployeController {
	@Autowired
	EmpService empservice;

	@GetMapping("/findall")
	public ModelAndView findall() {
		List<Employee> employees = empservice.findAll();
		return new ModelAndView("findall", "empl", employees);
	}

	@GetMapping("/apply")
	public String apply() {
		return "Register";

	}

	@PostMapping("/save")
	public String save(Employee employee) {
		empservice.save(employee);
		return "redirect:/findall";

	}

	@GetMapping("/update")
	public String update(@RequestParam("eid") Integer eid, Model model) {
		Employee emp = empservice.findbyid(eid);
		model.addAttribute("empl", emp);
		return "Update";
	}

	@PostMapping("/modify")
	public String modify(Employee employee) {
		empservice.update(employee);
		return "redirect:/findall";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("eid") Integer eid) {
		 empservice.deletebyid(eid);
		
		return "redirect:/findall";
	}
}
