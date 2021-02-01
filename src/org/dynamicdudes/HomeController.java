package org.dynamicdudes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHome()
	{
		return "Home";
	}
	
	
	@RequestMapping("/newform")
	public String showNewForm()
	{
		return "newform";
	}
	
	@RequestMapping("/viewform")
	public String showExistingApplications()
	{
		return "viewform";
	}
	
	
	
}
