package edu.handong.csee.lab13.prob2;

public class Main {

	public static void main(String[]args) {
		Book book = new Book("Simple Book"); // instantiate Book class
		Science science = new Science("Hello Physics!","ScienceWorld"); // instantiate Science class
		History history = new History("Whar Is history?","E.H.Carr"); // instatiate History class
		
		book.show(); // call show method of Book class
		science.show(); // call show method of Science class
		history.show(); // call show method of History class
	}
}
