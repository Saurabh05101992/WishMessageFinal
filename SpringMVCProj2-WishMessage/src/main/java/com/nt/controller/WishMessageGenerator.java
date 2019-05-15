package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishMessageGenerator extends AbstractController {

	//handle request internal method
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		int hour =0;
		Calendar calendar = null;
		calendar = Calendar.getInstance();
		String msg=null;
		
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		
		if(hour >12)
			msg="Good night";
		
		return new ModelAndView("wishmessage","msg",msg);
	}

}
