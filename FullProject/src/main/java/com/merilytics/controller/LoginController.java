package com.merilytics.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.merilytics.dto.LoginDTO;

/**
 * @author sameer
 *
 */
@Controller
public class LoginController {
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public @ResponseBody String loginPage(@RequestBody LoginDTO map){
		System.out.println("inside login controller");
		System.out.println(map.getuName()+"        "+map.getPwd());
		//System.out.println(userName.length());
		//System.out.println(userName+""+passWord);
		return "logged in successfully";
	}
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public @ResponseBody List test(){
		System.out.println("inside test suresh controller");
		List map= new ArrayList();
		map.add("edfcevw");
		System.out.println("changes");
		//what the fuck is this
		return map;
	}
//first github project
}
