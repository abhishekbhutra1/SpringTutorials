package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	/*When constructor with string, string parmeters is called and there is no such constructor defined  
	 * then it calls the constructor defined on the top. It such constructor is defined then that will be called. 
	 * */
	
	public Addition(double a,double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Addition: double, double");
	}
	
	public Addition(int a,int b) {
		this.a = a;
		this.b = b;
		System.out.println("Addition: int, int");
	}
	
	public void doSum() {
		System.out.println("Addition value is ="+(this.a+this.b));
	}
}
