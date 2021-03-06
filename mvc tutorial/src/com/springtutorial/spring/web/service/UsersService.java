package com.springtutorial.spring.web.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.springtutorial.spring.web.dao.User;
import com.springtutorial.spring.web.dao.UsersDAO;


@Service("usersService")
public class UsersService {

	private UsersDAO usersDao;
	

	@Autowired
	public void setUsersDao(UsersDAO usersDao) {
		this.usersDao = usersDao;
	}

	public void create(@Valid User user) {

		usersDao.create(user);
	}

	public boolean exists(String username) {
		
		return usersDao.exists(username);
	}

	@Secured("ROLE_ADMIN")
	public List<User> getAllUsers() {
		
		
		
		return usersDao.getAllUsers();
		
	}

	
}
