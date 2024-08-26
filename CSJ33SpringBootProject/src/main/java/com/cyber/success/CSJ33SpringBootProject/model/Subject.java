package com.cyber.success.CSJ33SpringBootProject.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="subject_table")
public class Subject {
	@Id
	@GeneratedValue
	@Column(name="sub_code")
	private long subjectCode;
	@Column(name="sub_name")
	private String subjectName;
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public long getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(long subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", course=" + course + "]";
	}
	
	
	


}