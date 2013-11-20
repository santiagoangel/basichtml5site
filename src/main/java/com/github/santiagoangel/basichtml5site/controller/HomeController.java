package com.github.santiagoangel.basichtml5site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String loadHomePage(Model m) {
		m.addAttribute("name", "Tester");
		return "home";
	}
}
