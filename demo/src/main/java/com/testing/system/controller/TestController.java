package com.testing.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

		@GetMapping("/hello")
			public String login() {
				return "/hello";
			}
}
