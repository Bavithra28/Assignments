package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
//@RequestMapping(value="/main")		//function level

public class FirstController {
	@RequestMapping(value="/one",method=RequestMethod.GET)			//class level, they are deprecated,so we use getmapping,postmapping.
	public String first()
	{
		return "hello";		//view page -->view resolver -->prefix WEB-INF-->.JSP
	}
	//@RequestMapping(value="/two")
	@GetMapping(value= {"/two","/three"})
	public String second()
	{
		return "world";		//view page -->view resolver -->prefix WEB-INF-->.JSP
	}
	
	// @GetMapping(value= {"/four"})
	@PostMapping(value= {"/four"})     //return string with model
	public String third(@RequestParam("userid") int udata,@RequestParam("username") String uname,Model model)		//form should be as argument in this function
	{
		System.out.println("UI data received" + udata);
		System.out.println("UI data received" + uname);
		model.addAttribute("key1",uname);
		return "success";
	}
	@PostMapping(value= {"/five"})      //return object, with model and view
	public ModelAndView five(@RequestParam("userid") int udata,@RequestParam("username") String uname)		//form should be as argument in this function
	{
		System.out.println("UI data received" + udata);
		System.out.println("UI data received" + uname);
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("key1", udata);
		return modelAndView;
	}
	
	@GetMapping(value= "/six/{somedata}")      //ef for path variable
	public String six(@PathVariable("somedata") String uname, Model any)		
	{
		System.out.println("path variable" + uname);
		User user= new User(10,"happy","bee");			//hardcoded for user.java
		any.addAttribute("obj", user);
		
		// any.addAttribute("key",uname);
		
		return "path";
	}
}

