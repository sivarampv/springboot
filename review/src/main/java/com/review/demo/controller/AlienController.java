package com.review.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.review.demo.model.Alien;
import com.review.demo.service.AlienService;

@RestController

public class AlienController {
	@Autowired
	AlienService alService;
	@GetMapping("/getcricket")
	public List <Alien> getAllPlayers(){
		List <Alien> alList= alService.getAllPlayer();
		return alList;
		
	}
	@PostMapping(value="/saveAlien")
	public Alien saveAlien (@RequestBody Alien a)
	{
		return alService.saveAlien(a);
	}
	@PostMapping(value="/updateAlien")
	public Alien updateAlien(@RequestBody Alien a)
	{
		return alService.saveAlien(a);
	}
	@DeleteMapping(value="deleteAlien/{rno}")
	public void deleteAlien(@PathVariable ("rno") int regno)
	{
		alService.deleteAlien(regno);
	}
	@GetMapping(value="/getAlien/{rno}")
	public Alien getAlien (@PathVariable("rno")int regno)
	{
		return alService.getAlien(regno); 
	}

}
