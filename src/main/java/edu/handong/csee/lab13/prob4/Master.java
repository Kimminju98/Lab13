package edu.handong.csee.lab13.prob4;

import java.util.Scanner;

public class Master {
	
	public void feed(Pet pet) {
		System.out.println("feed: "+pet.food());
	}
	
	
	public static void main(String[]args) {
		
		String cname,dname;
		System.out.print("Enter the cat name and dog name");
		Scanner mys = new Scanner(System.in);
		cname = mys.next();
		dname = mys.next();
		
		Cat cat = new Cat(cname);
		Dog dog = new Dog(dname);
		Master m = new Master();
		
		cat.display();
		m.feed(cat);
		
		dog.display();
		m.feed(dog);
		
	}
}
