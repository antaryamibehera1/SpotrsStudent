package com.student.service;

import java.util.List;

import com.student.entity.SportsStudent;

public interface SprotStudentService {

	public String addStudent(SportsStudent sportsstudent);

	public String addallStudent(List<SportsStudent> sportsstudent);

	public String deleteStudent(int id);

	public Object getstudent(int id);

	public Object getallstudent();

	public SportsStudent updateStudent(SportsStudent stud, int id);
}
