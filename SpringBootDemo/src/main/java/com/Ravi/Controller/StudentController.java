package com.Ravi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ravi.Model.Student;
import com.Ravi.Service.StudentService;
@RestController
public class StudentController {
	@Autowired
	public StudentService studentservice;
	
@GetMapping("/hi")
	public String helloworld() {
		return "hi ravi";
	}

@GetMapping("/wel")
public String welcome() {
	return "welcome ravi";
}

@GetMapping("/good")
public String good() {
	return "good ravi";
}
@GetMapping("/findAll")
public List<Student> findAll(){
	return studentservice.findAll();
	
}
}





