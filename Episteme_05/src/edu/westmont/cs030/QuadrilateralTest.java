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
		boolean isSquare = q.isSquare();
		assertEquals(true, isSquare);
	}
	
//	@Test
//	public void testSquareRight2() {
//		Quadrilateral q = new Quadrilateral(
//				2.0, 0.0,
//				3.0, -1.0,
//				2.0, -2.0,
//				1.0, -1.0
//		);
//		assertEquals(true, q.isSquare());
//	}
//	
//	@Test
//	public void testSquareWrong() {
//		Quadrilateral q = new Quadrilateral(
//				0.0,0.0,
//				0.0,1.0,
//				1.0,1.0,
//				1.0,1.0
//		);
//		boolean isSquare = q.isSquare();
//		assertEquals(false, isSquare);
//	}
//	
//	@Test
//	public void testSquareWrong2() {
//		Quadrilateral q = new Quadrilateral(
//				2.0, 0.0,
//				4.0, -1.0,
//				2.0, -2.0,
//				1.0, -1.0
//		);
//		assertEquals(false, q.isSquare());
//	}
	
	@Test
	public void testParrallelogram() {
		Quadrilateral q = new Quadrilateral(
				0.0, 0.0,
				3.0, 4.0,
				7.0, 4.0,
				4.0, 0.0
		);
		
		assertEquals(true, q.isParallelogram());
	}
}
