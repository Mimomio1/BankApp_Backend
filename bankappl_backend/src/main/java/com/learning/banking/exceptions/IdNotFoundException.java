package com.learning.banking.exceptions;

public class IdNotFoundException extends RuntimeException {


	public IdNotFoundException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return super.getMessage();
	}

}
