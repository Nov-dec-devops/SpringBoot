package com.Ravi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ravi.Model.Employe;
import com.Ravi.Repository.EmpRepository;
@Service
public class EmpServiceImpl implements EmpService{
@Autowired
private EmpRepository emprepo;
	@Override
	public List<Employe> findall() {
		
		return emprepo.findAll();
	}
	@Override
	public Employe save(Employe employe) {
		// TODO Auto-generated method stub
		return  emprepo.save(employe);
	}
	@Override
	public Employe update(Employe employe) {
		
		return emprepo.save(employe);
	}
	@Override
	public Employe findbyid(Integer eid) {
		// TODO Auto-generated method stub
		return emprepo.findById(eid).get();
	}
	@Override
	public void deletebyid(Integer eid) {
		
		 emprepo.deleteById(eid);
	}
	
	
}
