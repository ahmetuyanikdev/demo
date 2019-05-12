package com.auyanik.demo.service;

import com.auyanik.demo.service.method.Calculation;
import org.springframework.stereotype.Service;

@Service
public class CalculationService implements Calculation {

	@Override public int add2Number(int a,int b) {
		return a+b;
	}

	@Override public int multiply2Number(int a,int b) {
		return 0;
	}
}
