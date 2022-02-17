package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {
	
	
	@RequestMapping({"/","/index","/home"})
	public ModelAndView getMain() {
		return new ModelAndView("portfolio");
		
	}
//	@RequestMapping("/about")
//	public ModelAndView getAbout() {
//		
//		return new ModelAndView("aboutMe");
//		
//	}
	
}
