package com.auyanik.demo;

import com.auyanik.demo.reponse.Response;
import com.auyanik.demo.restcontroller.CalculationServiceController;
import com.auyanik.demo.service.CalculationService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DemoApplication.class)
@TestPropertySource(value = { "classpath:application.properties" })
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class DemoApplicationTests {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	CalculationServiceController calculationServiceController;

	@Autowired
	CalculationService calculationService;

	@Test
	public void contextLoads() {

	}

	@Test
	public void getDataIT() {
		Response response = restTemplate.getForObject("http://localhost:8080/hello/data", Response.class);
		Assert.assertNotNull(response);
		Assert.assertEquals(response.getData(), "data");
	}

	@Test
	public void addNumbersIT() {
		int a = 2;
		int b = 3;
		Integer result = restTemplate.getForObject("http://localhost:8080/calculate/add?a=" + a + "&" + "b=" + b, Integer.class);
		Assert.assertNotNull(result);
		Assert.assertEquals(result.intValue(),5);
	}

	@Test
	public void multiplyNumbersUT(){
		int a=2;
		int b=3;
		int result = calculationService.multiply2Number(a,b);
		Assert.assertEquals(result,a*b);
	}

}
