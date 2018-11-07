package com.devops.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	private final Logger LOG = LoggerFactory.getLogger(WelcomeController.class);

	@RequestMapping("/")
	public String welcome(Model model) {
		LOG.info("processing index html file");
		model.addAttribute("course", "devops");
		return "index";
	}
}
