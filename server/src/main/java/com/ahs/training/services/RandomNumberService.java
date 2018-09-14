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
	
	public RandomNumber getRandomNumber(){
		RandomNumber ran = new RandomNumber();
		generatedNumbers.add(ran);
		ran.setId(generatedNumbers.size() - 1);
		return ran;
	}
	
	public RandomNumber getRandomById(int i){
		return generatedNumbers.get(i);
	}
	
	public RandomNumber updateRandomNumber(long i, long newValue){
		RandomNumber ran = generatedNumbers.get((int) i);
		ran.setValue(newValue);
		return ran;
	}
}
