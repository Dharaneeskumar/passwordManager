package com.passwordmanager.model;

import org.springframework.stereotype.Component;

@Component
public class LoginModel {

	String userName;
	String userPassword;
	public LoginModel(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}
	public LoginModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "LoginModel [userName=" + userName + ", userPassword=" + userPassword + "]";
	}


}
