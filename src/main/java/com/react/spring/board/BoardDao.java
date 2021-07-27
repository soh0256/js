package com.react.spring.board;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.react.spring.test.HomeDto;

@Repository
public class BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<BoardDto> selectBoard(){

		return sqlSession.selectList("sql.selectBoard");

	}
	
	public List<BoardDto> selectModal(String board_no){

		return sqlSession.selectList("sql.selectModal", board_no);

	}

	public List<BoardDto> updateModal(Model mv) {
		return sqlSession.selectList("sql.updateModal", mv);
	}

}