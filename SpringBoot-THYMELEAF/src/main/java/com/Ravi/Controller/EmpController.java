package com.Ravi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Ravi.Model.Employe;
import com.Ravi.Service.EmpService;

@Controller
public class EmpController {
	@Autowired
	private EmpService empService;
	@GetMapping("/findall")
	public ModelAndView findall() {
		List<Employe> employes = empService.findall();
		return new ModelAndView("findall", "emp", employes);
	}
	@GetMapping("/addemp")
	public String empinfo(Model model) {
		Employe emp=new Employe();
		model.addAttribute("employe", emp);
		return "addnewemp";
		
	}
	
	@PostMapping("/save")
	public String save(Employe employe) {
		 empService.save(employe);
		 return "redirect:/findall";
	}
	@GetMapping("/update/{eid}")
	public String update(@PathVariable Integer eid, Model model) {
		Employe emp=empService.findbyid(eid);
		model.addAttribute("emp", emp);		
		return "update";
	}
	@PostMapping("/modify")
	public String modify(Employe employe) {
		empService.update(employe);
		return "redirect:/findall";
	}
	@GetMapping("/delete/{eid}")
	public String delete(@PathVariable Integer eid) {
		empService.deletebyid(eid);
		return "redirect:/findall";
	}
}
