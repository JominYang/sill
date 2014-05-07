package me.jomin.sill.demo.web.controller;

import javax.servlet.http.HttpServletRequest;

import me.jomin.sill.demo.biz.service.UserService;
import me.jomin.sill.demo.common.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo/user")
public class UserController {

	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/{id}/showUser")
	public String showUser(@PathVariable String id, HttpServletRequest request) {
		User u = userService.get(id);
		System.out.println(u.getName());
		request.setAttribute("user", u);
		return "showUser";
	}
	
	@RequestMapping("/testmvc")
	@ResponseBody
	public String testMvc(){
		
		System.out.println("testMVC");
		return "String";
	}
}
