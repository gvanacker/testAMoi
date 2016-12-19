package com.norauto.front.exception;

public class NorautoException extends Exception {

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	private static final long serialVersionUID = 1L;

	private String errorCode;

	public NorautoException() {
		super();
	}

	public NorautoException(String message) {
		super(message);
	}

	public NorautoException(Throwable cause) {
		super(cause);
	}

	public NorautoException(String message, Throwable cause) {
		super(message, cause);
	}

	public NorautoException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public NorautoException(Throwable cause, String errorCode) {
		super(cause);
		this.errorCode = errorCode;
	}

	public NorautoException(String message, Throwable cause, String errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
	}

}