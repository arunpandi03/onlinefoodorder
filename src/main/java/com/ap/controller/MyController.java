package com.ap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")

public class MyController {
   @GetMapping(value = "/welcome")
   public String welcome() {
      return "WELCOME TO MY ONLINE FOOD ORDER!!";
   }
   
   @GetMapping(value = "/home")
   public String home() {
      return "home";
   }
   

	   @GetMapping(value = "/login")
	   public String login() {
	      return "login";
	   }
	   
	   
	   @GetMapping(value = "/login1")
	   public String login1() {
	      return "login1";
	   }
}
