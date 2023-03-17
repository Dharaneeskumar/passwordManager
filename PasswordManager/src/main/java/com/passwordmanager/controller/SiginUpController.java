package com.passwordmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.passwordmanager.model.LoginModel;
import com.passwordmanager.service.LoginService;

@Controller
@RequestMapping("/signup")
public class SiginUpController {

	@Autowired
	LoginService service;
	
	@RequestMapping("/showsignuppage")
	public String showSignUpPage(Model model) {
		LoginModel signup=new LoginModel();
		
		model.addAttribute("signup", signup);
		
		return "signuppage";
		
	}
	@RequestMapping("/signupprocess")
	public String signUpProcess(@ModelAttribute LoginModel login , Model model) {
		
	String output=	service.siginUpService(login);
		
	model.addAttribute("output",output);
		return "signupdetail";
	}
}
