package com.react.spring.board;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

	@Autowired
	BoardDao boardDao;

	@RequestMapping(value = "/api/board.do", method = RequestMethod.GET)
	public String home(Model model) {

		String board_title = boardDao.sel();

		return board_title;
	}

}