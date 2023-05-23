package com.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sport")
public class SportsStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_id")
	private int id;
	@Column(name = "Age")
	private int age;
	@Column(name = "Student_Name")
	private String name;
	@Column(name = "Height")
	private double height;
	@Column(name = "Email")
	private String email;
	@Column(name = "Mobile_Number")
	private String mob;
	@Column(name = "Catagory_of_Sprots")
	private String sprotcatagory;
	@Column(name = "Review")
	private int review;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getSprotcatagory() {
		return sprotcatagory;
	}

	public void setSprotcatagory(String sprotcatagory) {
		this.sprotcatagory = sprotcatagory;
	}

	public int getReview() {
		return review;
	}

	public void setReview(int review) {
		this.review = review;
	}

	private SportsStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	private SportsStudent(int id, int age, String name, double height, String email, String mob, String sprotcatagory,
			int review) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.height = height;
		this.email = email;
		this.mob = mob;
		this.sprotcatagory = sprotcatagory;
		this.review = review;
	}

	@Override
	public String toString() {
		return "SportsStudent [id=" + id + ", age=" + age + ", name=" + name + ", height=" + height + ", email=" + email
				+ ", mob=" + mob + ",  sprotcatagory=" + sprotcatagory + ", review=" + review + "]";
	}

}
