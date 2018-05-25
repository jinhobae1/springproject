package com.dgit.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dgit.domain.Project;
import com.dgit.domain.SearchCriteria;
import com.dgit.service.ProjectService;

@Controller
public class ProjectController {

	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);

	@Autowired
	private ProjectService service;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerGet() {
		logger.info("board register Get........");

		 return "projectwriteForm";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPost(Project vo, String regdat , String enddat) throws Exception { // title, conten
		logger.info("board register Post ........");
		logger.info(vo.toString());
		
		SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd"); 
		
		Date date = dt.parse(regdat); 
		Date date1 = dt.parse(enddat); 
		
		vo.setRegdate(date);
		vo.setEnddate(date1);
		
		service.insertProject(vo);

		return "projectSuccess";
	}

	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public String listAll(Model model) throws Exception { // title, content
		logger.info("board listAll ........");

		List<Project> list = service.selectlistProject();
		model.addAttribute("list", list);
		
		 return "projectlist";
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(@RequestParam("projectno") int bno, Model model) throws Exception {
		logger.info("board read ........");
		logger.info("bno :" + bno);


		Project vo = service.selectlistProjectByid(bno);
		model.addAttribute("Project", vo);

		 return "projectRead";	

	}

	@RequestMapping(value = "/remove", method = RequestMethod.GET)
	public String remove(@RequestParam("projectno") int bno, Model model) throws Exception {
		logger.info("board remove ........");
		logger.info("bno :" + bno);

		service.deleteproject(bno);
		return "projectdelete";

	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(@RequestParam("projectno") int bno, Model model) throws Exception {
			logger.info("board read ........");
			logger.info("bno :" + bno);


			Project vo = service.selectlistProjectByid(bno);
			model.addAttribute("Project", vo);

		return "projectModify";

	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPost(Project vo, String regdat , String enddat) throws Exception { // title, conten
		logger.info("board register Post ........");
		logger.info(vo.toString());
		
		SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd"); 
		
		Date date = dt.parse(regdat); 
		Date date1 = dt.parse(enddat); 
		
		vo.setRegdate(date);
		vo.setEnddate(date1);
		
		service.updateproject(vo);

		return "projectSuccess";
	}
	
	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public void readPage(int bno, @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
		logger.info("board read ........");
		logger.info("bno :" + bno);
	
		Project vo = service.selectlistProjectByid(bno);
		model.addAttribute("Project", vo);

	}

	@RequestMapping(value = "/removePage", method = RequestMethod.GET)
	public String removePage(@RequestParam("bno") int bno, @ModelAttribute("cri") SearchCriteria cri, Model model)
			throws Exception {
		logger.info("board removePage ........");
		logger.info("bno :" + bno);
		logger.info(cri.toString());

		model.addAttribute("page", cri.getPage());
		model.addAttribute("perPageNum", cri.getPerPageNum());
		model.addAttribute("keyword", cri.getKeyword());
		model.addAttribute("searchType", cri.getSearchType());

		service.deleteproject(bno);

		return "redirect:/sboard/listPage";

	}

	@RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
	public String modifyPage(Model model, @ModelAttribute("cri") SearchCriteria cri, Project vo) throws Exception {
		logger.info("board modifyPage ........");
		logger.info("bno :", vo.getProjectno());
		logger.info(cri.toString());

		model.addAttribute("boardVO", vo);
		model.addAttribute("boardVO", vo);

		service.updateproject(vo);
		return "redirect:/sboard/listPage";

	}

}
