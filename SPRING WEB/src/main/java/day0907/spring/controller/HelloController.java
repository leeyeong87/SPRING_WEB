package day0907.spring.controller;

import java.util.Calendar;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

		@RequestMapping("/hello.do")
		public ModelAndView hello() {
			ModelAndView mav = new ModelAndView();
			//view ���� ����
			mav.setViewName("hello");
			//model ������ ����(key, value)
			mav.addObject("greeting", getGreeting());
			return mav;
		}
		
		private String getGreeting() {
			int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
			if (hour >= 6 && hour <= 10) {
				return "���� ��ħ�Դϴ�.";
			} else if (hour >= 12 && hour <= 15) {
				return "���ɽĻ�� �ϼ̳���?";
			} else if (hour >= 18 && hour <= 22) {
				return "���� �� �Ǽ���.";
			}
			return "�ȳ��ϼ���";
		}
}
