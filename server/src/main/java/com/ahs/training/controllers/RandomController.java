package com.ahs.training.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahs.training.model.RandomNumber;

@RestController
public class RandomController {
	
	@GetMapping("/getRandom")
	public RandomNumber getRandom(){
		return new RandomNumber();
	}

}
