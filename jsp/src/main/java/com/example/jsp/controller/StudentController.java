package com.example.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.jsp.dto.CourseDto;
import com.example.jsp.dto.StudentDto;
import com.example.jsp.service.CourseService;
import com.example.jsp.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/shtml")
	public String stdHtml()
	{
		return "student";
	}
	
	@PostMapping("/si")
	@ResponseBody
	public String insertStudent(@ModelAttribute StudentDto dto)
	{
		System.out.println(dto);
		String cn=dto.getCoursename();
		CourseDto courseDto = courseService.fetchCourse(cn);
		dto.setCourseDto(courseDto);
		System.out.println(dto);
		
		return studentService.insertStudent(dto);
	}
	
	@GetMapping("/fid")
	public String fetchById(@RequestParam int id,ModelMap map)
	{
		StudentDto student = studentService.fetchById(id);
		map.put("obj", student);
		return "fid.html";
	}
	
	@GetMapping("/fetchall")
	public String fetchAllStudent(ModelMap map)
	{
		List<StudentDto> list = studentService.fetchAll();
		map.put("objects", list);
		return "fetchallstudent.html";
	}
	
	
	
	
}
