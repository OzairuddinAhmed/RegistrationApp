package com.capgemini.exception;

public class AccountValidationException extends Exception {
	private String message;

	
	public AccountValidationException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
