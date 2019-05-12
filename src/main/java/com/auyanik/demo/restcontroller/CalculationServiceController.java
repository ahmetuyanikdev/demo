package com.auyanik.demo.restcontroller;

import com.auyanik.demo.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculate")
public class CalculationServiceController{

	@Autowired
	CalculationService calculationService;

	@RequestMapping(value = "/add",method = RequestMethod.GET)
	public int add2Number(@RequestParam int a,@RequestParam int b){
		return calculationService.add2Number(a,b);
	}


}
