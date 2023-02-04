package com.Ravi.HelloController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
@GetMapping("/hello")
	public String Hello() {
		return "hello";
	}
@GetMapping("/wel")
public String welcome(Model model) {
	model.addAttribute("name", "ravi kumar");
	return "welcome";
}
}
