package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.student.dao.StudentSportDao;
import com.student.entity.SportsStudent;

@Service
public class SportStudentServiceImpl implements SprotStudentService {
	@Autowired
	public StudentSportDao dao;

	// Add One single Value into DB
	@Override
	public String addStudent(SportsStudent sportsstudent) {
		dao.save(sportsstudent);
		return "Student is added";
	}

	// Add List of Element into DB
	@Override
	public String addallStudent(List<SportsStudent> sportsstudent) {
		dao.saveAll(sportsstudent);
		return "Students are added into our databases";
	}

	// Delete one element by using ID
	@Override
	public String deleteStudent(int id) {
		// SportsStudent stud = dao.getById(id);
		// dao.delete(stud);
		dao.deleteById(id);
		return " Here only one Student is deleted from our databases";
	}

	// Get Element by Id
	@Override
	public Object getstudent(int id) {
		return dao.findById(id);

	}

	// Get all employee details
	@Override
	public Object getallstudent() {
		return dao.findAll();

	}

	@Override
	public SportsStudent updateStudent(SportsStudent stud, int id) {
		SportsStudent existingstud = dao.findById(id).orElseThrow();
		existingstud.setAge(stud.getAge());
		existingstud.setEmail(stud.getEmail());
		existingstud.setHeight(stud.getHeight());
		existingstud.setId(stud.getId());
		existingstud.setMob(stud.getMob());
		existingstud.setName(stud.getName());
		existingstud.setReview(stud.getReview());
		existingstud.setSprotcatagory(stud.getSprotcatagory());
		return stud;

	}

}
