package Hrms.business.concretes;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.business.abstracts.JobSeekerService;
import Hrms.dataAccess.abstracts.UserDao;
import Hrms.entity.abstracts.User;
import Hrms.entity.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class JobSeekerManager implements JobSeekerService{

	KPSPublicSoapProxy kpsPublic ;
	UserDao userDao;
	
	@Autowired
	public JobSeekerManager(KPSPublicSoapProxy kpsPublic, UserDao userDao) {
		super();
		this.kpsPublic = kpsPublic;
		this.userDao = userDao;
	}

	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean identityController(JobSeeker jobSeeker) throws RemoteException {
		if(kpsPublic.TCKimlikNoDogrula(jobSeeker.getTcNo(), jobSeeker.getName().toUpperCase(), jobSeeker.getSurName().toUpperCase(), jobSeeker.getBithday()) 
				&& isUsedBefore(jobSeeker) ) {
		return userDao.existsById(jobSeeker.getId());
	}

	return false;
	}

	@Override
	public boolean isUsedBefore(JobSeeker jobSeeker) {
		if(userDao.existsById(jobSeeker.getId())) {
		return false;
		}
		return true;
	}
	
}
