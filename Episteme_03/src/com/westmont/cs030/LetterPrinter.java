package com.westmont.cs030;

/**
 * 
 * @author john
 * @contact jpanos@westmont.edu
 * Date: Jan 27, 2020
 *
 */
public class LetterPrinter {

	public static void main(String[] args) {
		Letter letter = new Letter("Mary", "John");
		letter.addLine("I am sorry we must part.");
		letter.addLine("I wish you all the best.");
		System.out.println(letter.getText());
	}

}
