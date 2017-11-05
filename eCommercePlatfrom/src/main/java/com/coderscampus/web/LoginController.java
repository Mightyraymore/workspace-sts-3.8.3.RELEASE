package com.coderscampus.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderscampus.domain.User;

@Controller
public class LoginController 
{
@RequestMapping(value="/login", method=RequestMethod.GET)
public String loginGet (ModelMap model)
	{
	return "login";
	}

@RequestMapping(value="/register", method=RequestMethod.GET)
public String registerGet (ModelMap model)
{
	User user = new User();
	model.put("user", new User() );
	return "register";
}

}