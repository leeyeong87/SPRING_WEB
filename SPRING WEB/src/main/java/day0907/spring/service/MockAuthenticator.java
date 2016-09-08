package day0907.spring.service;

import day0907.spring.common.CommonLogger;

public class MockAuthenticator implements Authenticator {
	
	private CommonLogger commonLogger;


	public void authenticate(LoginCommand loginCommand)
			throws AuthenticationException {
		if (!loginCommand.getUserId().equals(loginCommand.getPassword())) {
			commonLogger.log("���� ���� - " + loginCommand.getUserId());
			throw new AuthenticationException();
		}
	}

	public void setCommonLogger(CommonLogger commonLogger) {
		this.commonLogger = commonLogger;
	}

}