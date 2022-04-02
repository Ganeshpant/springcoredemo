package com.example.demodi;

public class Customer {
 private int id;
 private String name;
 private String city;
 private int age;
 Customer(){
	 
 }
public Customer(int id, String name, String city, int age) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.age = age;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
}
 
}
