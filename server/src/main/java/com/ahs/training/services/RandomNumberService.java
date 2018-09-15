package com.ahs.training.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ahs.training.model.RandomNumber;

@Service
public class RandomNumberService {
	
	ArrayList<RandomNumber> generatedNumbers;
	
	public RandomNumberService(){
		generatedNumbers = new ArrayList<RandomNumber>();
	}
}
