package com.test;

public abstract class Figure {
	
	public String name;
	int a = 1;
	
	public Figure (String n) {
		
		name=n;
	}
	
	public String toString() {
		
		return name;
	}
	
	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();


}
