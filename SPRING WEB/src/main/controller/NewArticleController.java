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
	 
	// @RequestMapping�޼����� ���� Ÿ���� String => return���� viewname���� ��� 
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "article/newArticleForm";
	}
	// @Requesrt �޼����� �Ű������� ���޵� ��ü�� Model�����ͷ� view�� ���޵ȴ�.
	// �� �� Key�� Ÿ�Ը� (ù���� �ҹ���)�� Ű �̸����� ����Ѵ�.(��·�� �����Ѵ�)
	// @ModelArttribute: medel�� ������ �߰��� Ű ����
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("command") NewArticleCommand command) {
		articleService.writeArticle(command);
		return "article/newArticleSubmit";
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}

}
