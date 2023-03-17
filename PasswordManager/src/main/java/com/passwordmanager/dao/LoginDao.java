package com.passwordmanager.dao;

import javax.transaction.Transactional; 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.passwordmanager.model.LoginModel;

import com.students.entity.User;

@Repository
@EnableTransactionManagement
public class LoginDao {

	@Autowired
	SessionFactory session;
	
	
	public LoginDao(SessionFactory session) {
		super();
		this.session = session;
		
	}

	@Transactional
	public String loginDao(LoginModel login) {
		Session session1=session.getCurrentSession();
		String a;
		String name=login.getUserName();
		User query=session1.get(User.class, name);
		if(query==null) {
			return "null";
		}
		else {
		a=query.getUserPassword();}
		return a;
		}
	
	@Transactional
	public boolean signupDao(LoginModel signup) {
		
		Session session1=session.getCurrentSession();
		User u = new User(signup.getUserName(),signup.getUserPassword());
		if(session1.save(u)!=null) {
			return true;
		}
		else
			return false;
		
	}
	
	}






