package com.cyber.success.CSJ33SpringBootProject.service;

import java.util.List;

import com.cyber.success.CSJ33SpringBootProject.model.Course;

public interface CourseService {
	public Course addCourse(Course course);
     
	public List<Course> fetchAllCourses();
	public Course getCourseById(long courseId);
}
