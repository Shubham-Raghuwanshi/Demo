package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //it shows that this class is component of starter class  
public class Alian {
private int aid;
private int aname;
private int tech;
@Autowired // it adds the other component class  
private Laptop laptop;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public int getAname() {
	return aname;
}
public void setAname(int aname) {
	this.aname = aname;
}
public int getTech() {
	return tech;
}
public void setTech(int tech) {
	this.tech = tech;
}

public Laptop getLaptop() {
	return laptop;
}
public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}
public void show(){
	System.out.println("In Show");
	laptop.compile();
}

}
