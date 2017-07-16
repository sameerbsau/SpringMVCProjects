package com.merilytics.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.merilytics.dto.UsersDTO;
import com.merilytics.service.UsersService;

/**
 * @author sameer
 *
 */
@Controller
public class LoginController {
@Inject
	private UsersService service;
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody String loginPage(@RequestBody UsersDTO map) {
	/*	System.out.println("inside login controller");
		System.out.println(map.getuName() + "        " + map.getPwd());
		// System.out.println(userName.length());
		// System.out.println(userName+""+passWord);
*/	
		 UsersDTO dt=	service.loginService(map);
		 if(dt!=null)
		return "logged in successfully";
		 else
			 return "login failure";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public @ResponseBody List test() {
		System.out.println("inside test suresh controller");
		List map = new ArrayList();
		map.add("edfcevw");
		System.out.println("changes");
		// what the fuck is this
		return map;
	}
	// first github project
}
