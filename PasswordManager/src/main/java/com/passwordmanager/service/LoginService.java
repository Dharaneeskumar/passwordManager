 package com.passwordmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.passwordmanager.dao.LoginDao;
import com.passwordmanager.model.LoginModel;

@Service
public class LoginService {
	@Autowired
	LoginDao logindao;
	public boolean loginService(LoginModel login) {
		
		String out= logindao.loginDao(login);
		
	
		if(out.equals(login.getUserPassword())) {
			return true;
		}
		else
			return false;
	}
	
	public String siginUpService(LoginModel signup) {
		if(logindao.signupDao(signup))
			return " Account created sucessfully ";
		else
			return "Account not Created.Please Try again Later";
		
	}

}
