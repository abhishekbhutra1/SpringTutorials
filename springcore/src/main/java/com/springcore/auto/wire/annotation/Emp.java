package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	//@Qualifier annotation is used when one or more bean have same return type but different name.
	@Autowired
	@Qualifier("sherlockAddress")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Inside Setter Method");
		this.address = address;
	}

	public Emp(Address address) {
		System.out.println("Inside Constructor");
		this.address = address;
	}

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}
