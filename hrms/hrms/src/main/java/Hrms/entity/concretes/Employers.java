package Hrms.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import Hrms.entity.abstracts.User;
import lombok.Data;

@Data
@Entity
public class Employers extends User{

	@Id
	@GeneratedValue
	
	@Column(name = "webSite")
	private String webSite;
	
	@Column(name = "eMail")
	private String eMail;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "password")
	private String password;
}
