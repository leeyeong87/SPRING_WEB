package day0907.spring.service;

public interface Authenticator {
	
	void authenticate(LoginCommand loginCommand)
			throws AuthenticationException;

}
