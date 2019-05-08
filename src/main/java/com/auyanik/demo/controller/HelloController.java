package com.auyanik.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<String> getHello() {
		return Collections.emptyList();
	}
}
