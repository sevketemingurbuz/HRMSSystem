package Hrms.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import Hrms.entity.abstracts.User;
import lombok.Data;
@Entity
@Data
public class JobSeeker extends User{

	@GeneratedValue
	@Id
	
	@Column(name = "surName")
	private String surName;
	
	@Column(name = "tcNo")
	private long tcNo;
	
	@Column(name = "birthday")
	private int bithday;
	
	@Column(name = "eMail")
	private String eMail;
}
