package com.association;

public class Car {
 private String color;
 private int speed;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
 public void carDetails()
 {
	 System.out.println("The car speed is "+speed+" and the color is "+color);
 }
 
}
