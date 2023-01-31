package com.Ravi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ravi.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
