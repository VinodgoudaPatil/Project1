package com.example.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jsp.dao.CourseDao;
import com.example.jsp.dto.CourseDto;

@Service
public class CourseService {
	
	@Autowired
	CourseDao courseDao;
	
	public String insertCourse(CourseDto courseDto)
	{
		return courseDao.insertCourse(courseDto);
	}
	
	public CourseDto fetchCourse(String courseName)
	{
		return courseDao.fetchCourse(courseName);
	}
}
