package me.jomin.sill.demo.biz.service.impl;

import me.jomin.sill.demo.biz.service.UserService;
import me.jomin.sill.demo.common.model.User;
import me.jomin.sill.demo.integration.dao.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("me.jomin.sill.demo.biz.service.UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User get(String id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

}
