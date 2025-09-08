package com.example.demo.course.mongo;

import com.example.demo.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunnerMongo implements CommandLineRunner {
    @Autowired
    private CourseMongoRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course("1", "Learn Java", "Neeraj"));
        repository.save(new Course("2", "Learn Spring", "Neeraj"));
        repository.save(new Course("3", "Learn Spring Boot", "Neeraj"));

        repository.deleteById("3");

        System.out.println(repository.findById("2"));
        System.out.println(repository.findAll());
    }
}
