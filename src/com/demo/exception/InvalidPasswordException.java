package com.demo.exception;

public class InvalidPasswordException extends RuntimeException{
private String msg="Invalid Email!!!";
	
	public InvalidPasswordException(){};
	
	public InvalidPasswordException(String msg) {
		this.msg=msg;
	}
	
	public String toString() {
		return getClass().getName()+" :"+ msg;
	}
}
