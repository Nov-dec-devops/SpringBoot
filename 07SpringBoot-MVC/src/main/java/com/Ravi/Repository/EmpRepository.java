package com.Ravi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ravi.Model.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer>{

}
