package com.springtutorial.spring.web.dao;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springtutorial.spring.web.validation.ValidEmail;



public class User {

	@NotBlank(message = "Username can not be blank.")
	@Size(min= 8, max= 15, message = "Usename must be between 8 and 15 characters.")
	@Pattern(regexp = "^\\w{8,}$", message = "Username can only cosist of numbers, letters and the unerscore character(_)")
	private String username;
	@NotBlank(message = "Password can not be blank.")
	@Size(min= 8, max= 20, message = "Password must be between 8 and 20 characters.")
	@Pattern(regexp = "^\\S+$")
	private String password;
	@ValidEmail(message = "Invalid emal.")
	private String email;
	private boolean enabled = false;
	private String authority;
	
	public User() {
		
	}
	
	public User(String username, String password, String email, boolean enabled, String authority) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.enabled = enabled;
		this.authority = authority;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
