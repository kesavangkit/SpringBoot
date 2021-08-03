package com.SpringBootWebAppJPAOracle.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBootWebAppJPAOracle.Dao.IEmployeeDao;
import com.SpringBootWebAppJPAOracle.Entity.EmployeeEntity;

@Controller
public class EmployeeController {

	@Autowired
	IEmployeeDao employeeDao;

	@RequestMapping("/")
	public String sample() {
		return "index.jsp";
	}

	@RequestMapping("/addEmplyoee")
	public String addEmplyoee(EmployeeEntity employeeEntity) {
		employeeDao.save(employeeEntity);
		System.out.println("Student Successfully Added....");
		return "index.jsp";
	}

	@RequestMapping("/readEmplyoee") 
	public ModelAndView	readStudent(@RequestParam("id") int id) { 
		EmployeeEntity student = 	employeeDao.findById(id).orElse(new EmployeeEntity()); 
		ModelAndView	  modelAndView = new ModelAndView("result.jsp"); 
		modelAndView.addObject("student", student); 
		//Like above we can create our own methods as well.
		System.out.println("Student Read Successful....");
		return modelAndView;
	}
}