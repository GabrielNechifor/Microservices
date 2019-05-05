package com.naturalprogrammer.spring.email;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import comspring.email.EmailPasswordRecoveryApllication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EmailPasswordRecoveryApllication.class)
@WebAppConfiguration
public class NaturalprogrammerSpringEmailApplicationTests {

	@Test
	public void contextLoads() {
	}

}
