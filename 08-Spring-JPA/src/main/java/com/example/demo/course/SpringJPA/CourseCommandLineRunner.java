package com.example.demo.course.SpringJPA;

import com.example.demo.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    CourseSpringDataJpaRepository repo;
    @Override
    public void run(String... args) throws Exception {
        repo.save(new Course(7,"AWS","neeraj"));
        repo.save(new Course(8,"COBOL","Neeraj"));
        repo.deleteById(7L);
        System.out.println(repo.findById(8L));
        //
    }
}
