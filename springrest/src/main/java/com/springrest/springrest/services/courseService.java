package com.springrest.springrest.services;

import java.util.List;


import com.springrest.springrest.entity.Courses;

public interface courseService {
	
	public List<Courses> getCourses();
	
	
	public Courses getCourse(long courseId);


	public Courses addCourse(Courses course);


	public Courses updateCourse(Courses course);


	public void deleteCourse(long parseLong);

}
