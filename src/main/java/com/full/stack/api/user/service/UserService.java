package com.full.stack.api.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.full.stack.api.user.dao.UserDao;
import com.full.stack.api.user.vo.UserVo;

@Service
public class UserService {

	UserDao dao;
	
	@Autowired
	public UserService( UserDao dao ) {
		this.dao = dao;
	}
	
	public List<UserVo> getUserList() {
		return dao.getUserList();
	}
	
	public UserVo insertUser(UserVo vo) {
		return dao.insertUser(vo);
	}
}
