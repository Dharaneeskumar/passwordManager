package com.passwordmanager.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.passwordmanager.model.LoginModel;
import com.students.entity.UserContainer;

@Repository
@EnableTransactionManagement
public class displayContinerDao {

	@Autowired
	SessionFactory sessionfactory;
	
@Transactional
public List<UserContainer>  displaydao( LoginModel login){
	
	
	Session session=sessionfactory.getCurrentSession();
	
	//System.out.println(user);
	
String user1=login.getUserName();
	
	Query<UserContainer> query=session.createQuery("from UserContainer where username ='"+ user1 + "'", UserContainer.class);
	List<UserContainer> list=query.getResultList();
	return list;

}
@Transactional
public boolean adddatadao(UserContainer user) {
	
	Session session1=sessionfactory.getCurrentSession();
	System.out.println(user.getUsername());
	UserContainer u = new UserContainer(user.getApplicationName(),user.getApplicationPassword(),user.getUsername());
	
//	Query query=session1.createQuery("", UserContainer.class);
	if(session1.save(u)!=null) {
		return true;
	}
	else
		return false;
	
}
	
}

