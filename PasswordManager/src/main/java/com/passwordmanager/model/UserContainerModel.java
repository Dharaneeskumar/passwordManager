package com.passwordmanager.model;

import org.springframework.stereotype.Component;

@Component
public class UserContainerModel {

	String applicationName;
	String applicaionPassword;
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getApplicaionPassword() {
		return applicaionPassword;
	}
	public void setApplicaionPassword(String applicaionPassword) {
		this.applicaionPassword = applicaionPassword;
	}
	public UserContainerModel(String applicationName, String applicaionPassword) {
		super();
		this.applicationName = applicationName;
		this.applicaionPassword = applicaionPassword;
	}
	public UserContainerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserContainerModel [applicationName=" + applicationName + ", applicaionPassword=" + applicaionPassword
				+ "]";
	}
	
	
}
