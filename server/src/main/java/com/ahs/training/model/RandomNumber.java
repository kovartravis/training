package com.ahs.training.model;

import java.util.Date;

public class RandomNumber {
	private double value;
	private long timeGenerated;
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public long getTimeGenerated() {
		return timeGenerated;
	}

	public void setTimeGenerated(long timeGenerated) {
		this.timeGenerated = timeGenerated;
	}

	public RandomNumber(){
		value = Math.random();
		timeGenerated = new Date().getTime();
	}

}
