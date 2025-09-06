package com.example.demo.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJadbcTemplate;
	
	private static String INSERT_QUERY=
			"""
				insert into course values(1,'Leaarn Java', 'Neeraj');
			""";
	public void insert()
	{
		springJadbcTemplate.update(INSERT_QUERY);
	}
}
