package com.springtutorial.spring.web.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtutorial.spring.web.dao.Offer;
import com.springtutorial.spring.web.dao.OffersDAO;
import com.springtutorial.spring.web.dao.User;
import com.springtutorial.spring.web.dao.UsersDAO;


@Service("usersService")
public class UsersService {

	private UsersDAO usersDao;
	

	@Autowired
	public void setOffersDao(UsersDAO usersDao) {
		this.usersDao = usersDao;
	}

	public void create(@Valid User user) {

		usersDao.create(user);
	}

	public boolean exists(String username) {
		
		return usersDao.exists(username);
	}

	public List<User> getAllUsers() {
		
		
		
		return usersDao.getAllUsers();
		
	}

	
}
