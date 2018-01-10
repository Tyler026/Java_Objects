package com.java.object.tyler;

public class Person {

	public static void main(String[] args) {
		// instantiate new objects 
		personsFullName name1 = new personsFullName("Tyler", "Fuqua", -31);
		
		// set the fullName
		name1.setFirstName("Tyler");
		name1.setLastName("Fuqua");
		name1.setAge(32);
		System.out.println(name1.getFirstName() + " " + name1.getLastName() + " " + name1.getAge());
	}

}
	