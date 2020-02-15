package edu.westmont.cs030;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuadrilateralTest {
	@Test
	public void testSquareRight() {
		Quadrilateral q = new Quadrilateral(
				0.0,0.0,
				0.0,1.0,
				1.0,1.0,
				1.0,0.0
		);
		boolean isSquare = q.isRectangle();
		System.out.println("Test Square Right: \n" + q.toString());
		assertEquals(true, isSquare);
	}
	
	@Test
	public void testSquareRightRotated() {
		Quadrilateral q = new Quadrilateral(
				2.0, 0.0,
				3.0, -1.0,
				2.0, -2.0,
				1.0, -1.0
		);
		System.out.println("Test Square Right 2: \n" + q.toString());
		assertEquals(true, q.isSquare());
	}
	
	@Test
	public void testSquareWrong() {
		Quadrilateral q = new Quadrilateral(
				0.0,0.0,
				0.0,1.0,
				1.0,1.0,
				1.0,1.0
		);
		boolean isSquare = q.isSquare();
		System.out.println("Test Square Wrong: \n" + q.toString());
		assertEquals(false, isSquare);
	}
//	
//	@Test
//	public void testSquareWrong2() {
//		Quadrilateral q = new Quadrilateral(
//				2.0, 0.0,
//				4.0, -1.0,
//				2.0, -2.0,
//				1.0, -1.0
//		);
//		System.out.println("Test Square Wrong 2: \n" + q.toString());
//		assertEquals(false, q.isSquare());
//	}
//	
//	@Test
//	public void testParrallelogram() {
//		Quadrilateral q = new Quadrilateral(
//				0.0, 0.0,
//				3.0, 4.0,
//				7.0, 4.0,
//				4.0, 0.0
//		);
//		
//		System.out.println("Test Parrallelogram Right: \n" + q.toString());
//		assertEquals(true, q.isParallelogram());
//	}
//	
	@Test
	public void testRectangle() {
		Quadrilateral q = new Quadrilateral(
				2.0, 0.0,
				2.0, 2.0,
				5.0, 2.0,
				5.0, 0.0
		);
		
		System.out.println("Test Rectangle Right: \n" + q.toString());
		
		assertEquals(true, q.isRectangle());
	}
	
	@Test
	public void testRectangleRotated() {
		Quadrilateral q = new Quadrilateral(
				2.0, 0.0,
				4.0, -2.0,
				3.0, -3.0,
				1.0, -1.0
		);
		System.out.println("Test Rectangle Rotated: \n" + q.toString());
		assertEquals(true, q.isRectangle());
	}
}
