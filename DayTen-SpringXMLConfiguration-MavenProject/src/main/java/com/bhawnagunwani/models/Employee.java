package com.bhawnagunwani.models;

public class Employee {
	
	private int id;
	private String name;

	public Employee() {
		super();
		System.out.println("Default Constructor Invoked..");
	}

	public Employee(String name) {
		super();
		System.out.println("Parameterized Constructor Invoked..");
		this.name = name;
	}
	
	public Employee(int id, String name) {
		super();
		System.out.println("Parameterized Constructor with Two Parameters Invoked..");
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
