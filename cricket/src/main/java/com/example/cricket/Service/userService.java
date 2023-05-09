package com.example.cricket.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cricket.Model.userPage;
import com.example.cricket.Repository.userRepository;

@Service

public class userService {
	@Autowired
	userRepository userRepo;
public userPage saveUser(userPage U)
{
return userRepo.save(U);
}
public String validateUser(String username,String password)
{
	String result="";
	userPage u=userRepo.findByUsername(username);
	if(u==null)
	{
		result="Invalid user";
	}
		else
	{
			if(u.getPassword().equals(password))
			{

				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}

	return result;
	}
	}








