package com.demo.verify;

import com.demo.exception.InvalidPasswordException;

public class VerifyPassword {

	public VerifyPassword(String password) {
		boolean b=password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,15}$");
		if(!b) {
			throw new InvalidPasswordException();
		}
	}
}
