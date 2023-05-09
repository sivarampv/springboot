package com.example.cricket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cricket.Model.userPage;
import com.example.cricket.Service.userService;

@RestController
public class userController {
	@Autowired
	userService usrService;
	@PostMapping("/checkLogin")
		public String validateUser(@RequestBody userPage u)
		{
		System.out.println(u.getUsername());

			return usrService.validateUser(u.getUsername(),u.getPassword());
		}
	@PostMapping("/addUser")
	public userPage user(@RequestBody userPage u)
	{
   return usrService.saveUser(u);

	}

	}








