package com.Ravi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ravi.DAO.EmployeDAO;
import com.Ravi.Model.Employe;

@Service
public class EmployeServiceImpl implements EmployeService{
	@Autowired
	private EmployeDAO employeDAO;

	@Override
	public List<Employe> FindAll() {
		
		return employeDAO.FindAll();
	}

}
