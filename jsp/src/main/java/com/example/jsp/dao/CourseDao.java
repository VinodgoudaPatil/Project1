package com.example.jsp.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.jsp.dto.CourseDto;
import com.example.jsp.repository.CourseRepo;

@Component
public class CourseDao {
	
	@Autowired
	CourseRepo courseRepo;
	
	public String insertCourse(CourseDto courseDto)
	{
		courseRepo.save(courseDto);
		return "data is inserted";
	}
	
	public CourseDto fetchCourse(String courseName)
	{
		Optional<CourseDto> co = courseRepo.findById(courseName);
		return co.get();
	}
}
