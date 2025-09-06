package com.example.demo.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJadbcTemplate;
	
	private static String INSERT_QUERY=
			"""
				insert into course values(?,?,?);
			""";
	private static String DELETE_QUERY=
			"""
				delete from course where id = ?;
			""";
	private static String SELECT_QUERY=
			"""
				select * from course where id = ?;
			""";
	public void insert(Course course)
	{
		springJadbcTemplate.update(INSERT_QUERY, 
				course.getId(), course.getName(), course.getAuthor());
	}
	public void delete(long id)
	{
		springJadbcTemplate.update(DELETE_QUERY,id);
	}
	public Course select(long id)
	{
		return springJadbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
	}
}
