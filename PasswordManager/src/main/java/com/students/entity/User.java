package com.students.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.passwordmanager.model.LoginModel;

@Entity
@Table(name="userdetail")
public class User {
	
	@Id
	@Column(name="username")
	private String userName;
	@Column(name="userpassword")
	private String userPassword;
	

	public User(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	



	


	public User() {
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
		return "User [ userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
	
}
