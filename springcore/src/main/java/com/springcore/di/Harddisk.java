package com.springcore.di;

public class Harddisk {

	private String name;
	private String version;

	
	public Harddisk() {
	}

	public Harddisk(String name,String version) {
		this.name = name;
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Harddisk [name=" + name + ", version=" + version + "]";
	}	
	
}
