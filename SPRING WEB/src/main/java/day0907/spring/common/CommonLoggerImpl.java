package day0907.spring.common;

public class CommonLoggerImpl implements CommonLogger{
	
	public void log(String message){
		System.out.println("CommonLogger - "+message);
	}

}
