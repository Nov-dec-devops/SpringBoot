package com.Ravi.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ravi.EmplRepository.EmplyeeRepo;
import com.Ravi.Model.Employe;

@Service
public class EmployeServiceImpl implements EmployeService{
	@Autowired
	EmplyeeRepo rep;

	@Override
	public List<Employe> FindAll() {
		
		return rep.findAll();
	}

	@Override
	public Employe save(Employe employe) {
		 return rep.save(employe);
	}

	@Override
	public Employe update(Employe employe) {
		
		return rep.save(employe);
	}

	@Override
	public Employe findById(Integer eid) {
		
		return rep.findById(eid).get();
	}

	@Override
	public void DeleteById(Integer eid) {
		rep.deleteById(eid);
		
	}

	

	
}
