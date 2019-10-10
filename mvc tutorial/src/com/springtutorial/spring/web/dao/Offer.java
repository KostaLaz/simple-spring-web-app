package com.springtutorial.spring.web.dao;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

public class Offer {

	
	private int id;
	
	@Size(min = 5, max = 100, message = "Name must be between 5 and 100 characters.")
	private String name;
	@NotNull
	@Pattern(regexp = ".*\\@.*\\..*", message = "This is not a valid email adress")
	private String emial;
	@Size(min = 20, max = 100,  message = "Text must be between 20 and 100 characters.")
	private String text;

	public Offer() {

	}

	public Offer(String name, String emial, String text) {
		this.name = name;
		this.emial = emial;
		this.text = text;
	}

	public Offer(int id, String name, String emial, String text) {
		this.id = id;
		this.name = name;
		this.emial = emial;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return emial;
	}

	public void setEmail(String emial) {
		this.emial = emial;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", emial=" + emial + ", text=" + text + "]";
	}

}
