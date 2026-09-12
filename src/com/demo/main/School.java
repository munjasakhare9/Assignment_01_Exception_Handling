package com.demo.main;

import com.demo.exception.InvalidAgeException;
import com.demo.exception.InvalidEmailException;
import com.demo.exception.InvalidPasswordException;
import com.demo.verify.VerifyAge;
import com.demo.verify.VerifyEmail;
import com.demo.verify.VerifyPassword;

public class School {
	public void takeAdmission(Student s) {
		System.out.println("Welcome to this website");
		//verifyUser()
		verifyUser(s);
		System.out.println("thank you for visit");
	}
	
	private void verifyUser(Student s) {
		//logic
		
		//verify email
		String email=s.getEmail();
		try {
			new VerifyEmail(email);
		}catch(InvalidEmailException e) {
			s.setEmail(e.toString());
		}
		
		//verify password
		String password=s.getPassword();
		try {
			new VerifyPassword(password);
		}catch(InvalidPasswordException e) {
			s.setPassword(e.toString());
		}
		
		//verify age
		try {
			new VerifyAge(s.getAge());
		}catch(InvalidAgeException e) {
			s.setAge(s.getAge());
		}
		attendClass(s);
		
	}
	
	private void attendClass(Student s) {
		//display info of student
		System.out.println("*********************************************************************");
		System.out.println("Email :- " + s.getEmail());
		System.out.println("Password :- " + s.getPassword());
		System.out.println("Name :- " + s.getName());
		if(s.getAge()<6) {
			System.out.println("Age :- "+"Invalid Age!!! (age should be greater than or equal to 6)");
		}
		else {
			System.out.println("Age :- " + s.getAge());
		}
		System.out.println("Gender :- " + s.getGender());
		System.out.println("*********************************************************************");
	}
}
