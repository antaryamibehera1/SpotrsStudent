package com.student.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.SportsStudent;
import com.student.service.SportStudentServiceImpl;

@RestController
public class SportStudentController {
	@Autowired
	public SportStudentServiceImpl service;

	@PostMapping("/add")
	public String savestudent(@RequestBody SportsStudent sportsstudent) {
		return service.addStudent(sportsstudent);
	}

	@PostMapping("/addall")
	public String saveallStudent(@RequestBody List<SportsStudent> SportsStudent) {
		return service.addallStudent(SportsStudent);
	}

	@DeleteMapping("/delete/{id}")
	public String removeStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}

	@GetMapping("/get/{id}")
	public Object getdetail(@PathVariable int id) {
		return service.getstudent(id);
	}

	@GetMapping("/get")
	public Object getalldetails() {
		return service.getallstudent();
	}

	@PutMapping("{id}")
	public ResponseEntity<SportsStudent> updatestud(@PathVariable int id, @RequestBody SportsStudent sportsstudent) {
		return new ResponseEntity<SportsStudent>(service.updateStudent(sportsstudent, id), HttpStatus.OK);
	}

}
