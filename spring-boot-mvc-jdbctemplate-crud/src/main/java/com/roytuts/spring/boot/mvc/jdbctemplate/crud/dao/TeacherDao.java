package com.roytuts.spring.boot.mvc.jdbctemplate.crud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.roytuts.spring.boot.mvc.jdbctemplate.crud.model.Teacher;
import com.roytuts.spring.boot.mvc.jdbctemplate.crud.rowmapper.TeacherRowMapper;

@Repository
@Transactional
public class TeacherDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Teacher getTeacher(final int id) {
		Teacher teacher = jdbcTemplate.queryForObject("select * from teacher where id = ?", new TeacherRowMapper(), id);
		return teacher;
	}

	public List<Teacher> getTeachers() {
		List<Teacher> teachers = jdbcTemplate.query("select * from teacher", new TeacherRowMapper());
		return teachers;
	}

	public void addTeacher(final Teacher teacher) {
		jdbcTemplate.update("insert into teacher(name, expertise) values(?, ?)",
				new Object[] { teacher.getName(), teacher.getExpertise() });
	}

	public void updateTeacher(final Teacher teacher) {
		jdbcTemplate.update("update teacher set name = ?, expertise = ? where id = ?",
				new Object[] { teacher.getName(), teacher.getExpertise(), teacher.getId() });
	}

	public void deleteTeacher(final int id) {
		jdbcTemplate.update("delete from teacher where id = ?", new Object[] { id });
	}

}
