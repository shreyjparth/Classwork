package com.Exceptions;

public class NegetiveBalanceException extends Exception {

	public NegetiveBalanceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NegetiveBalanceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NegetiveBalanceException [toString()=" + super.toString() + "]";
	}
	
}
