package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosa() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void init(){
		//function name can be changed
		//just need to update in lifecycleconfig.xml
		System.out.println("Initialized method");
	}
	
	public void destroy(){
		//function name can be changed
		//just need to update in lifecycleconfig.xml
		System.out.println("Destroy method");
	}
}
