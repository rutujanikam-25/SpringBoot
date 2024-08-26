package com.cyber.success.CSJ33SpringBootProject.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course_Table")
public class Course {
	
	@Id
	@GeneratedValue
	@Column(name="course_id")
	private long courseId;
	@Column(name="course_name")
	private String courseName;
	@OneToMany(mappedBy="course" ,cascade=CascadeType.ALL)
	//@JoinColumn(name="subject_id")
	private List<Subject> subject;
	@Column(name="course_price")
	private double coursePrice;
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
	
	

}


