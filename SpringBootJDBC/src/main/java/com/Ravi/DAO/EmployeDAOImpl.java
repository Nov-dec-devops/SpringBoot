package com.Ravi.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Ravi.Model.Employe;
@Repository
public class EmployeDAOImpl implements EmployeDAO{
@Autowired
	private JdbcTemplate jdbctemplte;
	@Override
	public List<Employe> FindAll() {
		String sqlquery="SELECT * FROM employe";
		return jdbctemplte.query(sqlquery, new BeanPropertyRowMapper(Employe.class)) ;
	}

}
