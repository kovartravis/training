package com.ahs.training.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ahs.training.model.RandomNumber;

@Service
public class RandomService {
	
	ArrayList<RandomNumber> generatedNumbers;
	
	public RandomService(){
		generatedNumbers = new ArrayList<RandomNumber>();
	}
}
