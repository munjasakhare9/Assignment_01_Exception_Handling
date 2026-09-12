package com.demo.main;

public class MainClass {
	public static void main(String args[]) {
		//System.out.println("hello world");
		
		//Student class object for fill form
		Student s1=new Student();
		s1.setEmail("raj123gmail.com");
		s1.setPassword("abAc@");
		s1.setName("Raj Verma");
		s1.setAge(1);
		s1.setGender("male");
		
		//School class object for verify/validate input
		School sc1=new School();
		sc1.takeAdmission(s1);
		
		System.out.println(s1);
	}
}
