package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Example")
public class Student {
	
	/* in this case it generated a bean with name equal to camelcase version of Class name
	 you can mention a different name for this bean in this way @Component("obj")
	@Value anntation is used to assign initial values for the object created with the help of IOC Container
	*/
	
	@Value("Abhishek Bhutra")
	private String studentName;
	@Value("Kaliyaganj")
	private String city;
	@Value("#{places}")
	private List<String> places;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getPlaces() {
		return places;
	}
	public void setPlaces(List<String> places) {
		this.places = places;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	
}
