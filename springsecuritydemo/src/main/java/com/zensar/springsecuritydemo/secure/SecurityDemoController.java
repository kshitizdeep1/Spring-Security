package com.zensar.springsecuritydemo.secure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableWebSecurity
public class SecurityDemoController {
	
	@GetMapping(value="/")
	public String hello()
	{
		return "welcome";
	}
	
	@GetMapping(value="/user")
	public String user()
	{
		return "welcome user:";
	}
	
	@GetMapping(value="/admin")
	public String admin()
	{
		return "welcome admin:";
	}
}
