package com.Ravi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ravi.Model.Student;
import com.Ravi.Repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
@Autowired
	StudentRepository rep;
	
	@Override
	public List<Student> findall() {
		
		return rep.findAll();
	}

	@Override
	public Student save(Student student) {
		
		return rep.save(student);
	}

	@Override
	public Student update(Student student) {
		
		return rep.save(student);
	}

	@Override
	public void deletebyid(Integer sid) {
		rep.deleteById(sid);
		
	}

	@Override
	public Student findbyid(Integer sid) {
		
		return rep.findById(sid).get();
	}

}
