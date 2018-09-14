package com.ahs.training.model;

public class UpdateRequest {
	private int id;
	private long newValue;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getNewValue() {
		return newValue;
	}
	public void setNewValue(long newValue) {
		this.newValue = newValue;
	}
}
