package com.Ravi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ravi.Model.Employee;
import com.Ravi.Repository.EmpRepository;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	public EmpRepository emprep;

	@Override
	public List<Employee> findAll() {
		
		return emprep.findAll();
	}

	@Override
	public Employee save(Employee employee) {
		
		return emprep.save(employee);
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		return emprep.save(employee);
	}

	@Override
	public Employee findbyid(Integer eid) {
		
		return emprep.findById(eid).get();
	}

	@Override
	public void deletebyid(Integer eid) {
		emprep.deleteById(eid);
	}

	

	

	
	

	
	

	

	
}
