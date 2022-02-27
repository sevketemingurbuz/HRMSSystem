package Hrms.entity.abstracts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.Data;

@Entity
@Data
public abstract class User {

	
	@Id
	@GeneratedValue
	@Column(name = "name")
	private String name;
	
	@Column(name = "id")
	private int id;
}
