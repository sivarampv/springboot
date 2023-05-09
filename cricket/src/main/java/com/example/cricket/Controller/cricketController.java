package com.example.cricket.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cricket.Model.cricket;
import com.example.cricket.Service.cricketService;

@RestController

public class cricketController {
	@Autowired

	cricketService criService;

	@GetMapping(value="/landin")

	public List<cricket> getAllcricket()

	{
		List<cricket>criList = criService.getcricket();

		return criList;

	}

	

	@PostMapping(value="/savecricket")

	public cricket savecricket(@RequestBody cricket s)

	{

		return criService.savecricket(s);

	}

	@PutMapping(value="/updatecricket")

	public cricket updatecricket(@RequestBody cricket regno)

	{

		return criService.savecricket(regno);

	}

	@DeleteMapping(value="deletecricket/{name}")

	public void deleteStudent(@PathVariable ("name") int name)

	{

		criService.deletecricket(name);

	}

	@GetMapping(value="/getcricket")

	public List<cricket> getcricket()

	{

		return criService.getcricket();

	}

	@GetMapping("/sortcricket/{name}")



    public List<cricket> sortcricket(@PathVariable String name)



    {



    	return criService.sortcricket(name);



    }



    @GetMapping("pagination/{nm}/{sp}")



	public List<cricket> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size)



	{



		return criService.paginate(num,size);



	}



	@GetMapping("pagination/{nm}/{sp}/{inr}")



	public List<cricket> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)



	{



		return criService.paginate(num,size,name);



	}
}



	