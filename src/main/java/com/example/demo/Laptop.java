package com.example.demo;

import org.springframework.stereotype.Component;

@Component 
public class Laptop {
private int lId;
private int brand;
public int getlId() {
	return lId;
}
public void setlId(int lId) {
	this.lId = lId;
}
public int getBrand() {
	return brand;
}
public void setBrand(int brand) {
	this.brand = brand;
}
@Override
public String toString() {
	return "Laptop [lId=" + lId + ", brand=" + brand + "]";
}
public void compile() {
	System.out.println("compiling");
}
}
