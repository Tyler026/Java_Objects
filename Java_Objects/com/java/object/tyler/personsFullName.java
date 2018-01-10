package com.java.object.tyler;

public class personsFullName {
	// Create a Class (FirstName, LastName, Age)
	String firstName;
	String lastName;
	int age;
	
	// overloaded constructor #1
	public personsFullName(String first) {
		firstName = first;
	}
	// overloaded constructor #2
	public personsFullName(String first, String last) {
		firstName = first;
		lastName = last;
	}
	// overloaded constructor #3
	public personsFullName(String first, String last, int age) {
		firstName = first;
		lastName = last;
		this.age = age;
		
		if (age <= -1) {
			System.out.println("Attempted to set age to an invalid value. Set age to 0 instead");
		} else {
			System.out.println(age);
		}
	}
	
	// getter method
	public String getFirstName() {
		return firstName;
	}
	// setter method
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	// getter method
	public String getLastName() {
		return lastName;
	}
	// setter method
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	// getter method
	public int getAge() {
		return age;
	}
	// setter method
	public void setAge(int newAge) {
		if (age <= -1) {
			System.out.println("Attempted to set age to an invalid value. Set age to 0 instead");
		} else {
			System.out.println(age);
	}
	
}}	
