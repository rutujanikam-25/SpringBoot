package com.cyber.success.CSJ33SpringBootProject.dao;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyber.success.CSJ33SpringBootProject.model.Course;
import com.cyber.success.CSJ33SpringBootProject.model.Subject;
import com.cyber.success.CSJ33SpringBootProject.repository.CourseRepository;
import com.cyber.success.CSJ33SpringBootProject.service.CourseService;

@Service
public class CourseDao implements CourseService {
	@Autowired
	private  CourseRepository repos;

	@Override
	public Course addCourse(Course course) {
	List<Subject> listOfSubject=new ArrayList();
	int size=course.getSubject().size();
	for(int i=0; i<size;i++)
	{
		
		Subject s=course.getSubject().get(i);
		s.setCourse(course);
		listOfSubject.add(s);
	}
		Course cObj=repos.save(course);
		return cObj;
	}

	@Override
	public List<Course> fetchAllCourses() {
		//List<ManagedEntityObject>fetchAll()---JpaRepository
		List<Course> listOfCourse=repos.findAll();
		return listOfCourse;
	   }

	@Override
	public Course getCourseById(long courseId) {
		//Course courseObj=repos.getById(courseId);	
		/*Optional<Course> op=repos.findById(courseId);
		Course c=op.get();
		return c;*/
		
		//EntityObject getById(long primarykey value)
		Course obj=repos.getById(courseId);
		System.out.println(obj);
		return obj;	}
	
	
	public int update(Course c) {
		int updateStatus=repos.updateCourse(c.getCourseName(), c.getCoursePrice(), c.getCourseId());
		return updateStatus;
	}
	
	public int deleteCourse(long cid) {
		Course c=repos.getById(cid);
		if(c!=null) {
			repos.delete(c);
			return 1;
		}
		return 0;
	}
	
	public List<Course> fetchAllCourse(){
		List<Course> listOfCourse=repos.findAll();
		return listOfCourse;
	}
	
	}
	


