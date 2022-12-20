package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	private List<Phone> phoneNumbers;
	
	public Person(String name, int personId,Certi certi,List<Phone> phoneNumbers) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + ", phoneNumbers=" + phoneNumbers + "]";
	}
		
}
