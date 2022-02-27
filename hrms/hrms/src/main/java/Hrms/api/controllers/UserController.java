package Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.business.abstracts.EmployersService;
import Hrms.business.abstracts.JobSeekerService;
import Hrms.dataAccess.abstracts.UserDao;
import Hrms.entity.abstracts.User;

@RestController
@RequestMapping("/api/users")
public class UserController {

	EmployersService employersService;
	JobSeekerService jobSeekerService;
	
	@Autowired
	public UserController(EmployersService employersService, JobSeekerService jobSeekerService) {
		super();
		this.employersService = employersService;
		this.jobSeekerService = jobSeekerService;
	}

	public List<User> getEmployers(){
		
		return employersService.getAll();
		
	}
	
	public List<User> getJobSeekers(){
		return jobSeekerService.getAll();
	}
}
