/*
 * @author John Panos (Westmont College)
 * @contact jpanos@westmont.edu
 * @class CS-030
 * @assignment DieSimulator
 * Created on Wed Jan 8 2020 10:34:08 AM
 */

package com.westmont.cs030;

import java.util.Random;

public class DieSimulator {

	public static void main(String[] args) {
		Random random = new Random();
		int roll = 1 + random.nextInt(6);
		System.out.println(roll);
	}

}
