package com.example.jsp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jsp.dao.StudentDao;
import com.example.jsp.dto.StudentDto;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	public String insertStudent(StudentDto dto)
	{
		return studentDao.insertStudent(dto);
	}
	
	public StudentDto fetchById(int id)
	{
		Optional<StudentDto> od = studentDao.fetchById(id);
		if(od.isPresent())
		{
			return od.get();
		}else {
			return null;
		}
	}
	
	public List<StudentDto> fetchAll()
	{
		List<StudentDto> list = studentDao.fetchAllStudent();
		if(list.isEmpty())
		{
			return null;
		}else {
			return list;
		}
	}
}
