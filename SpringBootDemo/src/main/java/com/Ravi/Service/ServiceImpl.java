package com.Ravi.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Ravi.Model.Student;
@Service
public class ServiceImpl implements StudentService{

	@Override
	public List<Student> findAll() {
		List<Student> students=Arrays.asList(new Student[] {
				new Student(1, "ravi", 30000.00),
				new Student(2, "kumar", 40000.00),
				new Student(1, "satya", 50000.00)
				
		});
		return students;
	}

	

	
}
