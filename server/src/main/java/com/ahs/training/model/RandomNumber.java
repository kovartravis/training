package com.ahs.training.model;

import java.util.Date;

public class RandomNumber {

	private long id;
	private double value;
	private long timeGenerated;
	
	public RandomNumber(){
		value = Math.random();
		timeGenerated = new Date().getTime();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public long getTimeGenerated() {
		return timeGenerated;
	}
}
