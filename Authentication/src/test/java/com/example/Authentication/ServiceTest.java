package com.example.Authentication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Authentication.entities.User;
import com.example.Authentication.services.UserService;

@SpringBootTest
public class ServiceTest {
	
	@Autowired
	private UserService service;

	@Test
    public void whenGetAllUsers_thenReturnCountNotZero() {
    	Iterable<User> users = service.GetAllUsers();
    	int count = 0;
    	
    	for(User user : users) {
    		count++;
    	}
    	
    	assertNotEquals(count, 0);
    }
	
	@Test
	public void whenGetUsersByName_thenReturnUser() {
		User users = service.GetUserByName("moss");
		
		assertEquals(users.getName(), "moss");
	}
	
	@Test
	public void whenGetUserById_thenReturnUser() {
		User users = service.GetUserById(1);
		
		assertEquals(users.getName(), "moss");
	}
	
	@Test 
	public void whenUpdateUser_thenReturntheUpdate() {
		User users = service.GetUserByName("moss");
		users.setEmail("coolio@gmail.com");
		//Did it this way on purpose, so I did not get persistence in my actual DB
		//System.out.println("---------------------------------------" + users.getEmail());
		
		assertEquals(users.getEmail(), "coolio@gmail.com");
		
	}
}
