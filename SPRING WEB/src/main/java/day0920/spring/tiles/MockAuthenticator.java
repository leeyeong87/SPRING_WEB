package day0920.spring.tiles;

public class MockAuthenticator implements Authenticator {
	//�α��� �� abc��� ���̵�� �α��� �ؾ� ����
		public void authenticate(String id, String password) {
			if (!id.equals("abc")) {
				throw new AuthenticationException("invalid id "+id);
		}
	}
}