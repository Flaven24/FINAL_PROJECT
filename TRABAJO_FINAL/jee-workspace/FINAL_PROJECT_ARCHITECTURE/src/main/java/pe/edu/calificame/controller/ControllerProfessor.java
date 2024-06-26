package pe.edu.calificame.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Course;
import model.University;
import pe.edu.calificame.dao.CourseDAO;
import pe.edu.calificame.dao.CourseDAOImpl;
import pe.edu.calificame.service.CourseService;
import pe.edu.calificame.service.CourseServiceImpl;
import pe.edu.dto.DtoUniversity;

/**
 * Session Bean implementation class BeanUniversity
 */
@Named
@SessionScoped
public class ControllerProfessor implements Serializable {
	private List<Course> listCourse;

	@Inject
	CourseServiceImpl courseServiceImpl;

	public ControllerProfessor() {
	}

	@PostConstruct
	public void initialize() {
		listCourse = courseServiceImpl.listAll();
	}

	public List<Course> getListCourse() {
		listCourse = courseServiceImpl.listAll();
		return listCourse;
	}

	public void setListCourse(List<Course> listCourse) {
		this.listCourse = listCourse;
	}

}