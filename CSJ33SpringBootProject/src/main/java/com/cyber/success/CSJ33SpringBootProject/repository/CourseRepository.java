package com.cyber.success.CSJ33SpringBootProject.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cyber.success.CSJ33SpringBootProject.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{
	@Transactional
	@Modifying
	@Query("update Course c set c.courseName=:p1, c.coursePrice=:p2 where c.courseId=:p3")
  public int updateCourse(@Param("p1")String cname,
		                   @Param("p2")double cprice,
		                   @Param("p3")long cid);
	
	
	//@Query("select c.courseId, c.courseName,c.coursePrice,s.subjectName from Course c inner join Subject s ON c.courseId=s.course")
	//public List<Course> viewAll();
	
}














