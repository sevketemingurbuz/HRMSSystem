package Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import Hrms.entity.abstracts.User;
import Hrms.entity.concretes.Employers;

@Service
public interface EmployersService extends UserService {

	boolean isItSame(Employers employer , String eMail);
	boolean isItUsed(Employers employer);
	List<User> add(Employers employer);
}
