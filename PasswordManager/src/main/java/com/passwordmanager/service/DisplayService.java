package com.passwordmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.passwordmanager.dao.displayContinerDao;
import com.passwordmanager.model.LoginModel;
import com.students.entity.UserContainer;
@Service
public class DisplayService {
	

	@Autowired
	displayContinerDao displaydao;

	public List<UserContainer> displayService(LoginModel login) {
		List<UserContainer> list= displaydao.displaydao(login);	
		return list;
	}
	
	public boolean adddataService(UserContainer user) {
		
		displaydao.adddatadao(user);
		return true;
		
	}

}
