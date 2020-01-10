package com.westmont.cs030;

public class HalfSizePicture {

	public static void main(String[] args) {
		// Create image and center it
		Picture pic = new Picture();
		pic.load("queen-mary.png");
		
		// Resize
		int newWidth = pic.getWidth() / 2;
		int newHeight = pic.getHeight() / 2;
		pic.scale(newWidth, newHeight);
		
		// Move it to the center
		pic.move(newWidth / 2, newHeight / 2);
	}

}
