package com.demo.verify;

import com.demo.exception.InvalidAgeException;

public class VerifyAge {
	public VerifyAge(int age) {
		if(age<6) {//!(age>=6)
			throw new InvalidAgeException("Invalid age (Age should be greater than or equal to 6)");
		}
	}
}
