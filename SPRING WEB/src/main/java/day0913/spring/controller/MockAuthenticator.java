package day0913.spring.controller;

import javax.naming.AuthenticationException;

public class MockAuthenticator implements Authenticator{
	
	@Override
	public void authenticate(String id, String password) throws AuthenticationException{
		if(!id.equals("test")){
			throw new AuthenticationException("invalid id "+id);
		}
	}
}
