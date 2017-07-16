package com.merilytics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//new changes what are the new things for the saxsx
@Controller
public class LaunchController {
	@RequestMapping(value="/getting.ht",method=RequestMethod.GET)
	public String link(){
		System.out.println("in getting");
		return "page";
	}
	
	@RequestMapping(value="/new.ht",method=RequestMethod.GET)
	public String link1(){
		System.out.println("in new");
		return "new";
	}

}
