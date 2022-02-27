package Hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.entity.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
