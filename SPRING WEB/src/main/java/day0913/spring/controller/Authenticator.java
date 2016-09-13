package day0913.spring.controller;

import javax.naming.AuthenticationException;

public interface Authenticator {
	
	void authenticate(String id, String password) throws AuthenticationException;
}
