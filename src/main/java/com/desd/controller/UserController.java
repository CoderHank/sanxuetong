package com.desd.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.desd.domain.User2;
import com.desd.exception.BusinessException;
import com.desd.param.BaseParam;
import com.desd.param.ResponseParam;
import com.desd.service.IUserService;
import com.desd.util.Logs;


@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User2 user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping(value="/getUser", method = RequestMethod.GET)
	@ResponseBody
	public String getUserInfo(){
		User2 user = this.userService.getUserById(1);
		String result = JSON.toJSONString(user);
		
		return result;
	}
	
	@RequestMapping(value="/testGetUser", method = RequestMethod.GET)
	@ResponseBody
	public String testGetUserInfo(){
		BaseParam<Integer> baseParam = new BaseParam<>();
		ResponseParam<User2> resultParam = new ResponseParam<User2>();
		try {
			Logs.getLogger().error("===进入 testGetUserInfo(");
			resultParam.setData(this.userService.testGetUser(baseParam));
		} catch (BusinessException e) {
			resultParam.setMsg(e.getMessage());
			resultParam.setStatusCode(e.getErrorType().toString());
		}
		
		return resultParam.toJson();
	}
}
