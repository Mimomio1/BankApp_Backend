package com.learning.banking.exceptions;


public class NoRecordsFoundException extends Exception {
	public NoRecordsFoundException() {
		super();
	}

	public NoRecordsFoundException(String message) {
		super(message);
	}
}
