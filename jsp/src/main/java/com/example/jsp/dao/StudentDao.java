package com.example.jsp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.jsp.dto.StudentDto;
import com.example.jsp.repository.StudentRepo;

@Component
public class StudentDao {
	
	@Autowired
	StudentRepo studentRepo;
	
	public String insertStudent(StudentDto dto)
	{
		studentRepo.save(dto);
		return "data is inserted";
	}
	
	public Optional<StudentDto> fetchById(int id)
	{
		return studentRepo.findById(id);
	}
	
	public List<StudentDto> fetchAllStudent()
	{
		List<StudentDto> list = studentRepo.findAll();
		return list;
	}
}
