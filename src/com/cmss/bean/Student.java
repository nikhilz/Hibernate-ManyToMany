package com.cmss.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="STUDENT")
public class Student {

	private int studentId;
	private String studentName;
	private Set<Course> courses = new HashSet<Course>(0);
	
	
	
	
	
	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}





	public Student(String studentName, Set<Course> courses) {
		super();
		this.studentName = studentName;
		this.courses = courses;
	}




@Id
@GeneratedValue
@Column(name="STUDENT_ID")
	public int getStudentId() {
		return studentId;
	}





	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}




@Column(name="STUDENT_NAME",nullable=false)
	public String getStudentName() {
		return studentName;
	}





	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}




  @ManyToMany(cascade= CascadeType.ALL)
  @JoinTable(name="STRING_COURSE", joinColumns={@ JoinColumn(name="STUDENT_ID")},	inverseJoinColumns={@JoinColumn(name="COURSE_ID")})
	public Set<Course> getCourses() {
		return courses;
	}





	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	
	
	
}
