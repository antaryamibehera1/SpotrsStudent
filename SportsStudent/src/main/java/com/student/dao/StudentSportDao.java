package com.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.SportsStudent;

public interface StudentSportDao extends JpaRepository<SportsStudent, Integer> {

}
