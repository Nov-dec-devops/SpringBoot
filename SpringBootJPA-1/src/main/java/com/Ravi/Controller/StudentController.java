package com.Ravi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ravi.Model.Student;
import com.Ravi.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService StudentService;

	@GetMapping("/findall")
	public List<Student> students() {
		return StudentService.findall();
	}

	@PostMapping("/save")
	public Student save(@RequestBody Student student) {
		return StudentService.save(student);
	}
@PutMapping("/update")
public Student update(@RequestBody Student student) {
	return StudentService.update(student);
	
}

@DeleteMapping("/delete/{sid}")
public void deletebyid(@PathVariable Integer sid) {
	StudentService.deletebyid(sid);
}

@GetMapping("/findbyid/{sid}")
public Student findbyid(@PathVariable Integer sid) {
	return StudentService.findbyid(sid);
}
}
