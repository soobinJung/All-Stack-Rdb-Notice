package com.full.stack.api.user.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class UserVo {
	
	private int userSeq;
	private String userEmail;
	private String userName;
	private String userPassword;
}
