package com.full.stack.api.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.full.stack.api.user.service.UserService;
import com.full.stack.api.user.vo.UserVo;


@RestController
@RequestMapping("/user")
public class UserController {
	UserService service;

	@Autowired
	public UserController( UserService service ) {
		this.service = service;
	}

	@GetMapping(value = "")
	public List<UserVo> getUserList() {
		return service.getUserList();
	}

	@PostMapping(value = "")
	public UserVo insertUser(
			
			@RequestParam(
					value          = "userEmail"
					, defaultValue = ""
					, required     = true
			) @Nullable String userEmail
			
			, @RequestParam(
					value          = "userName"
					, defaultValue = ""
					, required     = true
			) @Nullable String userName
			
			, @RequestParam(
					value          = "userPassword"
					, defaultValue = ""
					, required     = true
			) @Nullable String userPassword ) {
		
		return service.insertUser(UserVo.builder()
											.userEmail(userEmail)
											.userName(userName)
											.userPassword(userPassword)
											.build());
	}
}
