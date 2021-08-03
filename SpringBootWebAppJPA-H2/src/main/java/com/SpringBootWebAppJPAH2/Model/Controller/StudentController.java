package com.SpringBootWebAppJPAH2.Model.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBootWebAppJPAH2.Dao.IStudentDao;
import com.SpringBootWebAppJPAH2.Model.StudentEntity;

@Controller
public class StudentController {

	@Autowired
	IStudentDao studentDao;
	
	@RequestMapping("/")
	public String sample() {
		return "index.jsp";
	}

	@RequestMapping("/addStudent")
	public String addStudent(StudentEntity student) {
		studentDao.save(student);
		System.out.println("Student Successfully Added....");
		return "index.jsp";
	}

	@RequestMapping("/readStudent")
	public ModelAndView readStudent(@RequestParam("id") int id) {
		StudentEntity student = studentDao.findById(id).orElse(new StudentEntity());
		ModelAndView modelAndView = new ModelAndView("result.jsp");
		modelAndView.addObject("student", student);
		
		/*
		 * System.out.println(studentDao.findByCourse("IT"));
		 * //System.out.println(studentDao.findByCourseSorted("IT"));
		 * System.out.println(studentDao.findByidGreaterThan(id));
		 */
		//Like above we can create our own methods as well.
		System.out.println("Student Read Successful....");
		return modelAndView;
	}
}