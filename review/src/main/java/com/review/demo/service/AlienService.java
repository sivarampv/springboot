package com.review.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review.demo.model.Alien;
import com.review.demo.repository.AlienRepository;

@Service

public class AlienService {
	@Autowired
	AlienRepository alRepository;
	public List<Alien> getAllPlayer(){
		List<Alien> alList = alRepository.findAll();
		return alList;
		
	}
	public Alien saveAlien(Alien a) {
		Alien obj = alRepository.save(a);
		return obj;
	}
	public Alien updateAlien(Alien a) {
		Alien obj = alRepository.save(a);
		return obj;
	}
	public void deleteAlien(int regno)
	{
		alRepository.deleteById(regno);
	}
	public Alien getAlien(int regno)
	{
		return alRepository.findById(regno).get();
	}
	

}
