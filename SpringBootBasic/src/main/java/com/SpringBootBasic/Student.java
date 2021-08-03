package com.SpringBootBasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Student {
	
	private int id;
	private String name;
	private String course;
	@Autowired
	@Qualifier("subject")
	private Course courseObjet;
	
	public Student() {
		super();
		System.out.println("Initializing Student");
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void read() {
		System.out.println("Start Reading.......");
		getCourseObjet().printCourse();
	}

	public Course getCourseObjet() {
		return courseObjet;
	}

	public void setCourseObjet(Course courseObjet) {
		this.courseObjet = courseObjet;
	}

}