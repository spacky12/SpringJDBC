package com.example.demo.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository repository;
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn Java", "Neeraj"));
		repository.insert(new Course(2, "Learn Spring", "Neeraj"));
		repository.insert(new Course(3, "Learn SpringBoot", "Neeraj"));
		repository.delete(3);
	}

}
