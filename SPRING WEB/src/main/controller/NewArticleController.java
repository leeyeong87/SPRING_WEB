package spring.controller;

import org.apache.catalina.startup.ClassLoaderFactory.RepositoryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.service.ArticleService;
import spring.service.NewArticleCommand;

@Controller
@RequestMapping("/article/newArticle.do")
class NewArticleController {
	@Autowired
	private ArticleService articleService;
	 
	// @RequestMapping메서드의 리턴 타입이 String => return값을 viewname으로 사용 
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "article/newArticleForm";
	}
	// @Requesrt 메서드의 매개변수로 전달된 객체는 Model데이터로 view에 전달된다.
	// 이 때 Key는 타입명 (첫글자 소문자)을 키 이름으로 사용한다.(어쨌든 전달한다)
	// @ModelArttribute: medel에 데이터 추가시 키 지정
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("command") NewArticleCommand command) {
		articleService.writeArticle(command);
		return "article/newArticleSubmit";
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}

}
