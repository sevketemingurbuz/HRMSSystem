package Hrms.business.abstracts;

import org.springframework.stereotype.Service;

import Hrms.entity.concretes.Employers;

@Service
public interface SystemPersonelService extends UserService{

	boolean eMailAccept(Employers employer);
}
