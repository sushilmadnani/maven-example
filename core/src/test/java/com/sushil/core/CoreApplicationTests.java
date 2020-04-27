package com.sushil.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushil.core.services.PaymentService;
import com.sushil.core.services.PaymentServiceImpl;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreApplicationTests {

	@Autowired
	PaymentServiceImpl service;
	
	@Test
	public void testDependencyInjection() {
		assertNotNull(service.getDoa());
	}

}
