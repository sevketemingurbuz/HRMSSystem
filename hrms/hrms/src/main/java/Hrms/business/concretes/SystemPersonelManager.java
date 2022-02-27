package Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.business.abstracts.SystemPersonelService;
import Hrms.dataAccess.abstracts.UserDao;
import Hrms.entity.abstracts.User;
import Hrms.entity.concretes.Employers;

@Service
public class SystemPersonelManager implements SystemPersonelService{

	UserDao userDao;
	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}

	@Override
	public boolean eMailAccept(Employers employer) {
		
		return true;
	}

	@Autowired
	public SystemPersonelManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

}
