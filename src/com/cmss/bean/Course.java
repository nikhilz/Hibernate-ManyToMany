package com.cmss.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COURSE")
public class Course {

	private int courseId;
	private String courseName;
	
	
	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}


	
	@Id
	@GeneratedValue
	@Column(name="COURSE_ID")
	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

    
	
	
	
	@Column(name="COURSE_NAME",nullable=false)
	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
	
}
