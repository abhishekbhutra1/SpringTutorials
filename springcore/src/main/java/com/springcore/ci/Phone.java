package com.springcore.ci;

public class Phone {
	private String number;

	public Phone(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone [number=" + number + "]";
	}
	
}
