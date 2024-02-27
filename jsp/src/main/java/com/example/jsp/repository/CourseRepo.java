package com.example.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jsp.dto.CourseDto;

@Repository
public interface CourseRepo extends JpaRepository<CourseDto, String>{

}
