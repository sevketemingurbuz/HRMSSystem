package Hrms.business.abstracts;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import Hrms.entity.abstracts.User;
import Hrms.entity.concretes.JobSeeker;

@Service
public interface JobSeekerService  extends UserService{

	boolean identityController(JobSeeker jobSeeker) throws RemoteException;
	boolean isUsedBefore(JobSeeker jobSeeker);
}
