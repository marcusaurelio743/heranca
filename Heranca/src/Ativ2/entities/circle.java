package Ativ2.entities;

import Ativ2.entities.enums.Color;

public class circle extends Shape {
	
	private Double radius;
	
	public circle() {
		
	}
	

	public circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	


	public Double getRadius() {
		return radius;
	}


	public void setRadius(Double radius) {
		this.radius = radius;
	}


	@Override
	public Double area() {
		
		return Math.PI * radius * radius;
	}

}
