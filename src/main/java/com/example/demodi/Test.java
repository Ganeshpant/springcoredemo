package com.example.demodi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext contex = new ClassPathXmlApplicationContext("bean.xml");
	Customer cus = (Customer) contex.getBean("customer");
	System.out.println(cus);
	User us=  (User) contex.getBean("user");
System.out.println(us);
	
}
}
