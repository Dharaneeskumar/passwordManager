package com.students.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usercontainer")
public class UserContainer {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="application_name")
	String applicationName;

	public UserContainer(String applicationName, String applicationPassword, String username) {
		super();
		this.applicationName = applicationName;
		this.applicationPassword = applicationPassword;
		this.username = username;
	}

	@Column(name="application_password")
	String applicationPassword;
	
	@Column(name="username")
	String username;

	public UserContainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserContainer(String applicationName, String applicationPassword) {
		super();
		this.applicationName = applicationName;
		this.applicationPassword = applicationPassword;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApplicationPassword() {
		return applicationPassword;
	}

	public void setApplicationPassword(String applicationPassword) {
		this.applicationPassword = applicationPassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "UserContainer [id=" + id + ", applicationName=" + applicationName + ", applicationPassword="
				+ applicationPassword + "]";
	}
}
