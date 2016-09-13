package day0913.spring.controller;

public class AuthenticationException extends RuntimeException{
	
	private static final long serialVardionUID = 1L;
	
	public AuthenticationException(String message){
		super(message);
	}
}
    