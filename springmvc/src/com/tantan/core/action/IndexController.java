package com.tantan.core.action;



import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController{
	private static Logger logger = Logger.getLogger(IndexController.class);
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(HttpServletRequest request){
		logger.warn("你好");
		logger.info("测试");
		return "demo/index";   
	}

}
