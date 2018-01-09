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
	}
	
	// getter method
	public String getFirstName() {
		return firstName;
	}
	// setter method
	public String setFirstName(String newFirstName) {
		return firstName = newFirstName;
	}
	// getter method
	public String getLastName() {
		return lastName;
	}
	// setter method
	public String setLastName(String newLastName) {
		return lastName = newLastName;
	}
	// getter method
	public int getAge() {
		return age;
	}
	// setter method
	public int setAge(int newAge) {
		return age = newAge;
	}
	
}	
