package day0907.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import day0907.spring.service.LoginCommand;

public class LoginCommandValidator implements Validator{
	
	public boolean supports(Class<?> clazz){
		return LoginCommand.class.isAssignableFrom(clazz);
	}
	
	public void validate(Object target, Errors errors){
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "required");
		//required.loginCommand.userId
		//에러코드.객체타입.필드명
		//에러코드.필드명
		//에러코드
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"required");
		//required.password
	}

}
