package com.react.spring.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// STS_GIT TEST!!!!
// STS_GIT TEST%%%
@Controller
public class BoardController {

	@Autowired
	BoardDao boardDao;

	@ResponseBody
	@RequestMapping(value = "/sample-board.do", method = RequestMethod.GET)
	public List<BoardDto> selectBoard() {

		System.out.println(">>> selectBoard()");
		
		return boardDao.selectBoard();
	}
	
	@ResponseBody
	@RequestMapping(value = "/sample-board/modal/{board_no}", method = RequestMethod.GET)
	public List<BoardDto> selectModal(@PathVariable(value = "board_no") String board_no) {

		System.out.println(">>> selectModal()");
		System.out.println(">>> " + board_no);
		
		return boardDao.selectModal(board_no);
	}
	
	@ResponseBody
	@RequestMapping(value = "/sample-board", method = RequestMethod.POST)
	public String updateModal(HttpServletRequest res, Model mv) {

		System.out.println(">>> updateModal()");
		
		String board_no = res.getParameter("board_no");
		String board_title = res.getParameter("board_title");
		String board_contents = res.getParameter("board_contents");
		
		mv.addAttribute("board_no", board_no);
		mv.addAttribute("board_title", board_title);
		mv.addAttribute("board_contents", board_contents);
		
		boardDao.updateModal(mv);
		
		return "/sample-board.do";
	}

}

// TREE_GIT TEST