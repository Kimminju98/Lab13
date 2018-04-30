package edu.handong.csee.lab13.prob2;

public class Main {

	public static void main(String[]args) {
		Book book = new Book("Simple Book");
		Science science = new Science("Hello Physics!","ScienceWorld");
		History history = new History("Whar Is history?","E.H.Carr");
		
		book.show();
		science.show();
		history.show();
	}
}
