package com.prosick;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.prosick.service.AddService;
@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
		
		int i = Integer.parseInt(req.getParameter("t1"));
		int j = Integer.parseInt(req.getParameter("t2"));
		AddService as = new AddService();
		int k = as.add(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		return mv;
	}

	
}
