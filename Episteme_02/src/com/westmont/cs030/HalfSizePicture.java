/*
 * @author John Panos (Westmont College)
 * @contact jpanos@westmont.edu
 * @class CS-030
 * @assignment HalfSizePicture
 * Created on Mon Jan 13 2020 9:28:14 AM
 */


package com.westmont.cs030;

public class HalfSizePicture {

	public static void main(String[] args) {
		// Create image and center it
		Picture pic = new Picture();
		pic.load("http://www.op-art.co.uk/op-art-gallery/var/albums/your-op-art/twisting-spirals.jpg?m=1342043651");
		
		// Resize by half
		int newWidth = pic.getWidth() / 2;
		int newHeight = pic.getHeight() / 2;
		pic.scale(newWidth, newHeight);
		
		// Move top left origin to the center
		pic.move(newWidth / 2, newHeight / 2);
	}

}
