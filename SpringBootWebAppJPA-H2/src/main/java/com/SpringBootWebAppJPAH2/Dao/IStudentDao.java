package com.SpringBootWebAppJPAH2.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.SpringBootWebAppJPAH2.Model.StudentEntity;


public interface IStudentDao extends CrudRepository<StudentEntity, Integer> {

	List<StudentEntity> findByCourse(String course);
	List<StudentEntity> findByidGreaterThan(int id);
	
	@Query("from student s where s.course=?1 order by name")
	List<StudentEntity> findByCourseSorted(String course);
	
}