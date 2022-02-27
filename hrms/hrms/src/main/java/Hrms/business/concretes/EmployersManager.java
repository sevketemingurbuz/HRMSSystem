package Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.business.abstracts.EmployersService;
import Hrms.business.abstracts.SystemPersonelService;
import Hrms.dataAccess.abstracts.UserDao;
import Hrms.entity.abstracts.User;
import Hrms.entity.concretes.Employers;

@Service
public class EmployersManager implements EmployersService{

	SystemPersonelService systemPersonel;
	UserDao userDao;

	@Override
	public List<User> getAll() {
		
		return userDao.findAll();
	}

	@Override
	public boolean isItSame(Employers employer , String eMail) {
		if(employer.getWebSite() == eMail) {
		return false;
		}
		
		return true;
	}

	@Autowired
	public EmployersManager(SystemPersonelService systemPersonel, UserDao userDao) {
		super();
		this.systemPersonel = systemPersonel;
		this.userDao = userDao;
	}

	@Override
	public boolean isItUsed(Employers employer) {
		if(userDao.getById(null) == employer) {
		return false;
		}
		
		return true;
	}

	@Override
	public List<User> add(Employers employer) {
	
		if(isItSame(employer, "atakan@gmail.com") && isItUsed(employer)) {
			return userDao.findAll();
		}
		return null;
	}
	

}
