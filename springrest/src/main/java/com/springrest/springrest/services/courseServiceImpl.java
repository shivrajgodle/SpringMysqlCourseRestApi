package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Courses;

@Service
public class courseServiceImpl implements courseService {

	
	
//	List<Courses> list;
	
	@Autowired
	private CourseDao courseDao;
	
	public courseServiceImpl() {
		// TODO Auto-generated constructor stub
//		list = new ArrayList<>();
//		list.add(new Courses(101,"java programming","best course"));
//		list.add(new Courses(102,"python programming","best course"));
//		list.add(new Courses(103,"dart programming","best course"));
//		
	}
	
	

	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		
		
		return courseDao.findAll();
	}



	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Courses c = null;
//		for(Courses course : list) {
//			
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//			
//		}
		
		return courseDao.getOne(courseId);
	}




	@Override
	public Courses addCourse(Courses course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}




	@Override
	public Courses updateCourse(Courses course) {
		// TODO Auto-generated method stub
		
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//				
//			}
//		});
		courseDao.save(course);
		return course;
	}




	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		
//		list = this.list.stream().filter(e -> e.getId()!=parseLong).collect(Collectors.toList());
//		
		
		Courses entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
