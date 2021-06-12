package com.bhawnagunwani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bhawnagunwani.models.User;

@Controller
public class UserController {

	@RequestMapping(value = "/user-add", method = RequestMethod.GET)
	public String displayUserForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "userForm";
	}
	
	@RequestMapping(value = "/user-details", method = RequestMethod.POST)
	public String displayUserDetails(@ModelAttribute User user, Model model) {
		model.addAttribute("userDetail", user);
		return "userDetails";
	}
	
	
}
