package com.springtutorial.spring.web.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtutorial.spring.web.dao.Offer;
import com.springtutorial.spring.web.dao.OffersDAO;


@Service("offersService")
public class OffersService {

	private OffersDAO offersDao;
	
	
	public List<Offer> getCurrent(){
		
		return offersDao.getOffers();
	}

	@Autowired
	public void setOffersDao(OffersDAO offersDao) {
		this.offersDao = offersDao;
	}

	public void create(@Valid Offer offer) {

		offersDao.create(offer);
	}

	public void throwTestExeption() {
		offersDao.getOffer(145);
		
	}
}
