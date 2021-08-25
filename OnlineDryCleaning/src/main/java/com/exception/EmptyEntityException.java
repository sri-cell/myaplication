package com.exception;

public class EmptyEntityException extends RuntimeException  {

	private static final long serialVersionUID = 1L;

	public EmptyEntityException(String message) {
		super(message);
	}
}
