package com.hcl.pp.actions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.pp.model.User;

public class PetsAppController {
	@RequestMapping(value = "/user")
	public String welcome(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	@RequestMapping(value = "/user/authenticate")
	public String authenticateUser(@ModelAttribute("user") User user, Model model) {
		User sessionuser = securityService.authenticateUser(user);
		if (sessionuser != null) {
			model.addAttribute("sessionuser", sessionuser);
			return "pet_home";
		} else {
			return "userregn";
		}
	}

}
