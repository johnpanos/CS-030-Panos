package edu.westmont.cs030;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuadrilateralTest {
	@Test
	public void testRectangle() {
		Quadrilateral q = new Quadrilateral(
				0.0,0.0,
				0.0,1.0,
				1.0,1.0,
				1.0,0.0
		);
		assertEquals(true, q.isSquare());
	}
}
