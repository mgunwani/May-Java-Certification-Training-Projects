
package com.bhawnagunwani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public String hello() {
		return "welcome";
	}
	
	@RequestMapping("/message")
	public String getMessage() {
		return "message";	
	}
	
	@RequestMapping("/welcome")
	public ModelAndView getWelcomeMessage() {
		String myMessage = "Welcome Folks..!! Lets Learn Spring MVC";
		return new ModelAndView("welcome-message", "message", myMessage);	
	}
}
