package com.example.demo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao {
	
	@Autowired
    SqlSession sqlSession;

    public List<UserVo> getList() {
        return sqlSession.selectList("binsoo.getlist");
    }
    
    public UserVo findByUserName(String userName) {
        return sqlSession.selectOne("binsoo.findByUserName", userName);
    }
}
