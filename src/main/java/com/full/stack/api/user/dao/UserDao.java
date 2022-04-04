package com.full.stack.api.user.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.full.stack.api.user.vo.UserVo;

@Repository
public class UserDao {
	
	@Autowired
    SqlSession sqlSession;

    public List<UserVo> getUserList() {
        return sqlSession.selectList("user.getUserList");
    }
    
    public UserVo insertUser(UserVo vo) {
    	sqlSession.insert("user.insertUser", vo);
        return vo;
    }
    
    public UserVo findByUserEmail(String userEmail) {
        return sqlSession.selectOne("user.findByUserEmail", userEmail);
    }
}
