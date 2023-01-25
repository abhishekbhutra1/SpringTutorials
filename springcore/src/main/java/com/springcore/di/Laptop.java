package com.springcore.di;

public class Laptop {

	private String name;
	private Harddisk harddisk;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Harddisk getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(Harddisk harddisk) {
		this.harddisk = harddisk;
	}
	
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", harddisk=" + harddisk + "]";
	} 
	
	
}
