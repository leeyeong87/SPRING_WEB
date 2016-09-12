package day0912.spring.controller;

import java.util.Calendar;
import java.util.Date;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class EventExpirationCheckInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		if (checkEvent(request) && checkEventExpiration()) {
			displayEventExpirationPage(request, response);
			return false;
		}
		return true;
	}
		
	private boolean checkEvent(HttpServletRequest request) {
		return request.getRequestURI().equals(
				request.getContextPath() + "/event/list.do");
	}
		 
	private boolean checkEventExpiration() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, 9, 10);//2016.10.9
		Date now = new Date();
		return now.after(calendar.getTime());
	}
		
	private void displayEventExpirationPage(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.sendRedirect("eventExpired.do");
	}
		
}