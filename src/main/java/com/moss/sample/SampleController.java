package com.moss.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	@RequestMapping(value="showMessage")
	public String showMessage(Model model){
		model.addAttribute("message", "hello moss inbot");
		return "showMessage";
	}

}
