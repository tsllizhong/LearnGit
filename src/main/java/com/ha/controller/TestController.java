package com.ha.controller;

import javax.xml.registry.infomodel.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ha.test.Test;

@Controller
@RequestMapping("/testEntity")
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public void test(Test test,User user) {
		System.out.println(test+"by1");
		System.out.println(user);
	}
}
