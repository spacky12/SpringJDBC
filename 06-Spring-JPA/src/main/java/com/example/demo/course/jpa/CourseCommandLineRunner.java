package com.example.demo.course.jpa;

import com.example.demo.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJPARepository repository;
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn Java", "Neeraj"));
		repository.insert(new Course(2, "Learn Spring", "Neeraj"));
		repository.insert(new Course(3, "Learn SpringBoot", "Neeraj"));
		repository.delete(3);
		System.out.println(repository.select(2));
	}
}
