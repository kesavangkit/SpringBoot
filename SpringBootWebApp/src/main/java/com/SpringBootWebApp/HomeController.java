package com.SpringBootWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	/*
	 * @RequestMapping("home")//either you can proide the name or "/" public String
	 * home() { return "home.jsp"; }
	 */
	/*
	@RequestMapping("home")//either you can proide the name or "/"
	public String home(HttpServletRequest req) {
		String name = req.getParameter("name");
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		System.out.println("Hi :"+name);
		return "home.jsp";
	}*/
	
	/*
	@RequestMapping("home")//either you can proide the name or "/"
	public String home(String name, HttpSession session) {
		session.setAttribute("name", name);
		System.out.println("Hi :"+name);
		return "home.jsp";
	}*/
	
/*	@RequestMapping("home")//either you can proide the name or "/"
	public String home(@RequestParam("name") String myName, HttpSession session) {
		session.setAttribute("name", myName);
		System.out.println("Hi :"+myName);
		return "home.jsp";
	}*/
	
	/*
	@RequestMapping("home")//either you can proide the name or "/"
	public ModelAndView home(@RequestParam("name") String myName) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home.jsp");
		modelAndView.addObject("name", myName);
		System.out.println("Hi :"+myName);
		return modelAndView;
	}*/
	
	@RequestMapping("home")//either you can proide the name or "/"
	public ModelAndView home(Student student) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home.jsp");
		modelAndView.addObject("name", student);
		return modelAndView;
	}
}
