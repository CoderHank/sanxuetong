package com.desd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/forum")
public class ForumController {
	/**
	 * 获取所有主题
	 * @return
	 */
	@RequestMapping(value="/subjects", method=RequestMethod.GET)
	@ResponseBody
	public String getAllSubjects(){
		return null;
	}
	
	/**
	 * 根据ID获取特定主题
	 * @param subject_id
	 * @return
	 */
	@RequestMapping(value="/subject", method=RequestMethod.GET)
	@ResponseBody
	public String getSubjectById(@RequestParam("subject_id") long subject_id){
		return null;
	}
	
	/**
	 * 根据主题ID获取其下面所有的帖子
	 * @param subject_id
	 * @return
	 */
	@RequestMapping(value="/posts", method=RequestMethod.GET)
	@ResponseBody
	public String getPostsBySubjectId(@RequestParam("subject_id") long subject_id){
		return null;
	}
}
