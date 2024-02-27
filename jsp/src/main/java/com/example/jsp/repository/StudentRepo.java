package com.example.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jsp.dto.StudentDto;

public interface StudentRepo extends JpaRepository<StudentDto, Integer>{

}
