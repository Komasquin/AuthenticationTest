package com.example.Authentication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import com.example.Authentication.controllers.LoginController;

@SpringBootTest
class AuthenticationApplicationTests {

	@Autowired
	private LoginController controller;
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
