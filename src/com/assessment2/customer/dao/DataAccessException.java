package com.assessment2.customer.dao;

public class DataAccessException extends RuntimeException {
	
	private static final long serialVersionUID = -2082752907898854404L;
	
	public DataAccessException(String message) {
		super(message);
	}
}
