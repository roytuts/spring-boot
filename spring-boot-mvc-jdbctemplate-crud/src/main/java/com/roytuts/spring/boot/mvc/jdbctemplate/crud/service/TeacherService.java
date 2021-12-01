package com.roytuts.spring.boot.mvc.jdbctemplate.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.boot.mvc.jdbctemplate.crud.dao.TeacherDao;
import com.roytuts.spring.boot.mvc.jdbctemplate.crud.model.Teacher;

@Service
public class TeacherService {

	@Autowired
	private TeacherDao teacherDao;

	public Teacher getTeacher(final int id) {
		return teacherDao.getTeacher(id);
	}

	public List<Teacher> getTeachers() {
		return teacherDao.getTeachers();
	}

	public void addTeacher(final Teacher teacher) {
		teacherDao.addTeacher(teacher);
	}

	public void updateTeacher(final Teacher teacher) {
		teacherDao.updateTeacher(teacher);
	}

	public void deleteTeacher(final int id) {
		teacherDao.deleteTeacher(id);
	}

}
