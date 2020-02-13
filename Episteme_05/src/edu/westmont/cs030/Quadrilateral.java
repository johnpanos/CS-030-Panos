package edu.westmont.cs030;

/**
 * 
 * @author john
 * @contact jpanos@westmont.edu
 * Date: Feb 5, 2020
 *
 */
public class Quadrilateral {
	private enum ShapeType { 
		SQUARE,
		RECTANGLE,
		RHOMBUS,
		PARALLELOGRAM,
		TRAPEZOID
	}
	
	private final double EPSILON = 1E-11;
	
	private double x1, y1, x2, y2, x3, y3, x4, y4;
	
	public Quadrilateral(
			double x1,
			double y1,
			double x2,
			double y2,
			double x3,
			double y3,
			double x4,
			double y4
			) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
	}
	
	public boolean isSquare() {
		return false;
	}
	
	public boolean isRectangle() {
		return false;
	}
	
	public boolean isRhombus() {
		return false;
	}
	
	public boolean isParallelogram() {
		return false;
	}
	
	public boolean isTrapezoid() {
		return false;
	}
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner();
//		if (this.isRectangle()) {
//			
//		}
 	}
	
	private boolean isEqual(double a, double b) {
		return (Math.abs(a - b)) < EPSILON;
	}
}
