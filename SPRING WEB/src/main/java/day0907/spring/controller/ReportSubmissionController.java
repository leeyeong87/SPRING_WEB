package day0907.spring.controller;


import java.io.File;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import day0909.spring.upload.UploadfileVo;
import day0909.spring.upload.uploadDAO;

@Controller
public class ReportSubmissionController {

	private uploadDAO dao;
	
	public 
	
	@RequestMapping(value = "/report/submission.do", method = RequestMethod.GET)
	public String form() {
		return "report/submissionForm";
	}

	@RequestMapping(value = "/report/submitReport1.do", method = RequestMethod.POST)
	public String submitReport1(@RequestParam("studentNumber") String studentNumber,
			@RequestParam("report") MultipartFile report) {
		printInfo(studentNumber, report);
		if(report.getOriginalFilename().equals("")){
			System.out.println("File Lost");
		}else{
		upload(report);
		}
		return "report/submissionComplete";
	}

	private void printInfo(String studentNumber, MultipartFile report) {
		System.out.println(studentNumber + "가 업로드 한 파일: " + report.getOriginalFilename());
	}

	public void upload(MultipartFile report){
		String o_name = report.getOriginalFilename();
		long now = System.currentTimeMillis();
		Random r = new Random();
		int i = r.nextInt(50);
		o_name = now + "_" + i + "_" + o_name;
		File new_file = new File("e://upload//"+o_name);

		try{
			report.transferTo(new_file);
		}catch(Exception e){
			e.printStackTrace();
		}
		UploadfileVo f = new UploadfileVo(report.getOriginalFilename(),new_file.getPath());
		int insertcount = uploadDao.insertFile(f);
		if(insertcount==1){
			System.out.println("insert ok");
		}
	}
		
	@RequestMapping(value = "/report/submitReport2.do", method = RequestMethod.POST)
	public String submitReport2(MultipartHttpServletRequest request) {
		String studentNumber = request.getParameter("studentNumber");
		MultipartFile report = request.getFile("report");
		printInfo(studentNumber, report);
		return "report/submissionComplete";
	}

	@RequestMapping(value = "/report/submitReport3.do", method = RequestMethod.POST)
	public String submitReport3(ReportCommand reportCommand) {
		printInfo(reportCommand.getStudentNumber(), reportCommand.getReport());
		return "report/submissionComplete";
	}
	


}
