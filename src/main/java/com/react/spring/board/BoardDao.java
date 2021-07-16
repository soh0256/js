package com.react.spring.board;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public String sel(){

		return sqlSession.selectOne("sql.selectBoard");

	}

}