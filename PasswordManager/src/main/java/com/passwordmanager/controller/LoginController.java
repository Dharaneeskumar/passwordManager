package com.passwordmanager.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.passwordmanager.model.LoginModel;
import com.passwordmanager.service.DisplayService;
import com.passwordmanager.service.LoginService;
import com.students.entity.User;
import com.students.entity.UserContainer;

@Controller
@RequestMapping("/loginpage")
public class LoginController {

@Autowired
LoginService service;

@Autowired
DisplayService displayservice;

	@RequestMapping("/showloginpage")
	public String showLogin(Model model) {
		LoginModel login=new LoginModel();
		model.addAttribute("login", login);
		return "loginpage";
	}
	
	@RequestMapping("/processlogin")
	public String loginProcess(@ModelAttribute LoginModel login,Model model) {
	
		if(service.loginService(login)) {
				
		List<UserContainer> list=	displayservice.displayService(login);
		
		model.addAttribute("user", list);
		model.addAttribute("username",login.getUserName());
			return  "showdisplayform";  
			
		}
		else
			return "invalied";
	}
	
	

	
	@RequestMapping("/dataform")
	public String dataAddform(Model model0,@RequestParam("username") String  User) {
		UserContainer container=new UserContainer();
		model0.addAttribute("container",container);
		model0.addAttribute("User", User);
		
      

		return "addData";
	}
	
	@RequestMapping("/dataprocess")
	public String dataAddProcess(@ModelAttribute UserContainer user) {
	displayservice.adddataService(user);
		return "redirect:/loginpage/showloginpage";
	}
	
}
