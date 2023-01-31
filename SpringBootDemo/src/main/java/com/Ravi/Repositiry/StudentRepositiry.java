package com.Ravi.Repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ravi.Model.Student;

public interface StudentRepositiry extends JpaRepository<Student, Integer>{

}
