package com.ahs.training.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahs.training.model.RandomNumber;
import com.ahs.training.model.UpdateRequest;
import com.ahs.training.services.RandomNumberService;

@RestController
public class RandomController {
	
	private RandomNumberService randomService;
	
	public RandomController(RandomNumberService randomNumberService){
		randomService = randomNumberService;
	}
	
	@GetMapping("/getRandom")
	public RandomNumber getRandom(){
		return randomService.getRandomNumber();
	}
	
	@GetMapping("/get/{id}")
	public RandomNumber getRandomById(@PathVariable int id){
		return randomService.getRandomById(id);
	}
	
	@PostMapping("/updateRandom")
	public RandomNumber updateRandom(@RequestBody UpdateRequest data){
		return randomService.updateRandomNumber(data.getId(), data.getNewValue());
	}

}
