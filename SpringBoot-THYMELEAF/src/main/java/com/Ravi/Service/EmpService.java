package com.Ravi.Service;

import java.util.List;

import com.Ravi.Model.Employe;

public interface EmpService {

	List<Employe> findall();

	Employe save(Employe employe);

	Employe update(Employe employe);

	Employe findbyid(Integer eid);
	
	void deletebyid(Integer eid);

	
	

}
