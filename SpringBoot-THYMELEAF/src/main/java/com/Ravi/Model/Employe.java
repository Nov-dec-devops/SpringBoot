package com.Ravi.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Emps_tab")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employe {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String firstname;
	private String lastname;
	private String eroll;
	private String mail;
	private String department;
	private String mobile;
	
	private String username;
	private String password;
	
	
}
