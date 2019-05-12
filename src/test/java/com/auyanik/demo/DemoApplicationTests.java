package com.auyanik.demo;


import com.auyanik.demo.reponse.Response;
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

	@Test
	public void contextLoads() {

	}

	@Test
	public void getDataTest() {
		Response response = restTemplate.getForObject("http://localhost:8080/hello/data", Response.class);
		Assert.assertNotNull(response);
		Assert.assertEquals(response.getData(),"data");
	}

}
