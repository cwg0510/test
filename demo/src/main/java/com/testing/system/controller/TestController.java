package com.testing.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

		@RequestMapping("/")
			public String login() {
				return "/hello";
			}  
}
