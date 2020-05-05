package oop;

class Person {
	
	String firstname;
	String lastname;
	
	void first(){
		System.out.println("firstname is: " + firstname);
	}
	void last(){
		System.out.println("lastname is: " + lastname);
	}
}
public class basic {
	
	public static void main(String[] args) {
		//declare the class with a variable to call attributes within that class
		//This is called instantiating an object
		Person  d = new Person();
		//define properties
		d.firstname = "Mariel";
		d.lastname = "Medianesta";
		//Abstraction or get info from that object
		d.first();
		d.last();
		
	}
}
