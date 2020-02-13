package com.westmont.cs030;

/**
 * Allows you to create letters to send to other people
 * @author john
 * @contact jpanos@westmont.edu
 * Date: Jan 27, 2020
 *
 */
public class Letter {
	// Instance variables to store letter and from/to
	private String from;
	private String to;
	private String letter;
	
	/**
	 * Create a letter to send to someone
	 * @param from Who the letter is from
	 * @param to Who the letter is to
	 */
	public Letter(String from, String to) {
		this.from = from;
		this.to = to;
		this.letter = "";
	}
	
	/**
	 * Add a line to the letter
	 * @param line The line to add
	 */
	public void addLine(String line) {
		letter = letter.concat("\n").concat(line);
	}
	
	/**
	 * Gets the letter as a string
	 * @return The complete letter
	 */
	public String getText() {
		return String.format(
					"Dear %s:"
					+ "%s\n"
					+ "Sincerely,\n"
					+ "%s",
					to, letter, from);
	}
}
