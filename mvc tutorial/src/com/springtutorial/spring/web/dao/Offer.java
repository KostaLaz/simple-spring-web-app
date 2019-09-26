package com.springtutorial.spring.web.dao;

public class Offer {

	private int id;
	private String name;
	private String emial;
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
