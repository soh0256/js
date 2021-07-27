package com.react.spring.test;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@Autowired
	HomeDao homeDao;

	@ResponseBody
	@RequestMapping(value = "/sample-search/t", method = RequestMethod.GET)
	public List<HomeDto> home() {

		return homeDao.sel();

	}

}