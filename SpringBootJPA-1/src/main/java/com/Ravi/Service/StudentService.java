package com.Ravi.Service;

import java.util.List;

import com.Ravi.Model.Student;

public interface StudentService {

	List<Student> findall();

	Student save( Student student);

	Student update(Student student);

	void deletebyid(Integer sid);

	Student findbyid(Integer sid);

	



}
