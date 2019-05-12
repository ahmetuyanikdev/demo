package com.auyanik.demo.controller;

import com.auyanik.demo.reponse.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping(value = "/{data}", method = RequestMethod.GET)
	@ResponseBody
	public Response getData(@PathVariable("data") String data) {
		return new Response(data);
	}

}
