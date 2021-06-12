package com.bhawnagunwani.models;

import java.util.List;

public class Student {

	private String name;

	private String email;

	private String gender;

	private String password;

	private String passwordConfirm;

	private List<String> courses;

	private List<String> batches;

	private String hiddenMsg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public List<String> getBatches() {
		return batches;
	}

	public void setBatches(List<String> batches) {
		this.batches = batches;
	}

	public String getHiddenMsg() {
		return hiddenMsg;
	}

	public void setHiddenMsg(String hiddenMsg) {
		this.hiddenMsg = hiddenMsg;
	}

}
