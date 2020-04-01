package com.kh.doit.study.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kh.doit.study.common.pagination;
import com.kh.doit.study.model.service.StudyGroupService;
import com.kh.doit.study.model.vo.PageInfo;
import com.kh.doit.study.model.vo.StudyGroup;

@Controller
public class StudyGroupController {

	@Autowired
	private StudyGroupService sgService;

	@RequestMapping("sgList.go")
	public ModelAndView sgList(ModelAndView mv,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {
		System.out.println(currentPage);

		int listCount = sgService.getlistCount();

		System.out.println(listCount);

		PageInfo pi = pagination.getPageInfo(currentPage, listCount);

		ArrayList<StudyGroup> sgList = sgService.selectList(pi);

		mv.addObject("sgList", sgList);
		mv.addObject("pi", pi);
		mv.addObject("listCount", listCount);
		mv.setViewName("study/doitStudyList");

		return mv;
	}
	
	/**
	 * 디테일
	 * 작성자 : 서정도
	 * @param mv
	 * @param sgNo
	 * @param currentPage
	 * @return
	 */
	@RequestMapping("studyDetail.go")
	public ModelAndView studyDetail(ModelAndView mv, int sgNo,
			@RequestParam(value = "currentPage", required = false, defaultValue = "1") int currentPage) {

		StudyGroup sg = sgService.selectSg(sgNo);

		if (sg != null) {
			mv.addObject("sg", sg).addObject("currentPage", currentPage).setViewName("study/doitStudyDetail");
		} else {
			mv.addObject("msg", "게시글 상세조회 실패").setViewName("common/errorPage");
		}

		return mv;
	}
	
	
	
	

}
