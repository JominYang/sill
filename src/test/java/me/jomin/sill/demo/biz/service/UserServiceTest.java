package me.jomin.sill.demo.biz.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class UserServiceTest {

	@Autowired
	@Qualifier("me.jomin.sill.demo.biz.service.UserService")
	private UserService userService;
	
	@Test
	public void testGet() {
		
		System.out.println(userService.get(0+"").getName());
	}
}
