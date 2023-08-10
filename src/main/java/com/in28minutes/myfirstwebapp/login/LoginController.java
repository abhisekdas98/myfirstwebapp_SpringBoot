package com.in28minutes.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	//http://localhost:8080/login?name=Abhisek {the name after? should match with the variable name}
	
	private Logger logger=LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String gotoLoginPage()
	{
		
		return "login";
		
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String username,@RequestParam String password,ModelMap modelmap)
	{
		
		//this is not recommended for production application
		modelmap.put("username", username);
		modelmap.put("Password", password);
		logger.debug("user name is {}", username);
		logger.debug("user password is {}", password);
		
		return "sayHello";
		
	}
	

}
