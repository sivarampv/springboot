package com.example.cricket.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.cricket.Model.cricket;
import com.example.cricket.Repository.cricketRepository;

@Service

public class cricketService {
	@Autowired  

	cricketRepository criRepository;

	public List<cricket> getAllcricket()

	{

		List<cricket> criList = criRepository.findAll();

		return criList;

	}

	public cricket savecricket(cricket s) {

		cricket obj = criRepository.save(s);

		return obj;

	}

     public cricket updatecricket(cricket s) {

    	 cricket obj = criRepository.save(s);

    	 return obj;

     }

     public void deletecricket(int regno)

     {

    	 criRepository.deleteById(regno);

     }

     public List<cricket> getcricket()

     {

    	 return criRepository.findAll();

    	

     }

     public List<cricket> sortcricket(String name) 



 	{



 	    return criRepository.findAll(Sort.by(name));



 	}



 public List<cricket> paginate(int num, int size) 



 {



 	Page<cricket> p=criRepository.findAll(PageRequest.of(num, size));



 	return p.getContent();



 	



 }



 public List<cricket> paginate(int num, int size, String name) 



 {



 	Page<cricket> obj=criRepository.findAll(PageRequest.of(num, size,Sort.by(name)));



 	return obj.getContent();



 }





}

