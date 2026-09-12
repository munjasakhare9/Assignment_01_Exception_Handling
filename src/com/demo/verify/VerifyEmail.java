package com.demo.verify;

import com.demo.exception.InvalidEmailException;

public class VerifyEmail {
	public VerifyEmail(String email) {
		boolean b=email.matches("^[A-Za-z0-9._%+-]+@(gmail\\.com|outlook\\.com|rediffmail\\.com)$");
		if(!b) {
			throw new InvalidEmailException("Invalid Email!!!(email should belongs to gmail, outlook, rediffmail)");
		}
	}
}
