package com.example.demo.course.jpa;

import com.example.demo.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJPARepository {
    @PersistenceContext
    private EntityManager entityManager;
    public void insert(Course course) {
        entityManager.merge(course);
    }
    public Course select(long id)
    {
        return entityManager.find(Course.class, id);
    }
    public void delete(long id) {
        Course course = select(id);
        entityManager.remove(course);
    }
}
