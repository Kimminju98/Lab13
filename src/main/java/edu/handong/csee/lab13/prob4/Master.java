package edu.handong.csee.lab13.prob4;

import java.util.Scanner;

public class Master {
	
	public void feed(Pet pet) { // the parameter is reference of Pet interface 
		System.out.println("feed: "+pet.food()); // print out return value of food method that is in the Class 
	}
	
	
	public static void main(String[]args) {
		
		String cname,dname;
		System.out.print("Enter the cat name and dog name"); // print out
		Scanner mys = new Scanner(System.in); // instantiate Scanner class
		cname = mys.next(); // put user's input to cname
		dname = mys.next(); // put user's input to dname
		
		Cat cat = new Cat(cname); // instantiate Cat class with the parameter of cname
		Dog dog = new Dog(dname); // instantiate Dog class with the parameter of dname
		Master m = new Master(); // instantiate Master class
		
		cat.display(); // call display method of Animal class
		m.feed(cat); // call feed method of Master class and give the parameter, cat reference that is Cat class and implement Pet inferface
		
		dog.display(); // call display method of Animal class
		m.feed(dog); // call feed method of Master class and give the parameter, dog reference that is Dog class and implement Pet inferface
		
	}
}
