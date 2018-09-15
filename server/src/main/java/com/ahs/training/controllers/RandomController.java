package com.ahs.training.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahs.training.model.RandomNumber;
import com.ahs.training.services.RandomNumberService;

@RestController
public class RandomController {
	
	private RandomNumberService randomService;
	
	public RandomController(RandomNumberService randomNumberService){
		randomService = randomNumberService;
	}
	
}
