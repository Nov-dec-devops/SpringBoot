package com.Ravi.Service;

import java.util.List;

import com.Ravi.Model.Employee;

public interface EmpService {

	//List<Employee> findAll(Employee employee);

	List<Employee> findAll();

	Employee save(Employee employee);

	Employee update(Employee employee);

	Employee findbyid(Integer eid);

	void deletebyid(Integer eid);

	
	

}
