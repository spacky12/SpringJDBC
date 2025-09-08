package com.example.demo.course.mongo;

import com.example.demo.course.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseMongoRepository extends MongoRepository<Course, String> {

}
