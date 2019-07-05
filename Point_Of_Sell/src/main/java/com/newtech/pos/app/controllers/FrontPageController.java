package com.newtech.pos.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class FrontPageController {

	@GetMapping("/frontpage")
	public ModelAndView showFrontPage(ModelAndView model) {
		
		model.addObject("title", "This is the front page");
		model.addObject("message", "Hello from my front page");
		model.setViewName("frontpage");
		return model;
		
	}
}
