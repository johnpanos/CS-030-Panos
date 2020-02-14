package edu.westmont.cs030;

import java.util.Scanner;

/**
 * 
 * @author john
 * @contact jpanos@westmont.edu
 * Date: Feb 13, 2020
 *
 */
public class Quadrilateral {
	static class Point {
		private double x;
		private double y;
		
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public double distanceToPoint(Point point) {
			return Math.sqrt(
					Math.pow((point.getX() - this.getX()), 2) + 
					Math.pow((point.getY() - this.getY()), 2)
			);
		}
		
		public double slopeBetweenPoint(Point point) {
			return (point.getY() - this.getY()) / (point.getX() - this.getX());
		}
		
		public double getX() {
			return this.x;
		}
		
		public double getY() {
			return this.y;
		}
		
		@Override
		public String toString() {
			return String.format("X: %f Y: %f", x, y);
		}
	}
	
	private final double EPSILON = 1E-11;
	
	private Point p1, p2, p3, p4;
	
	public Quadrilateral(
			double x1, double y1,
			double x2, double y2,
			double x3, double y3,
			double x4, double y4
			) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
		this.p4 = new Point(x4, y4);
	}
	
	public boolean isSquare() {
		// Diagonal lengths
		double distanceP1ToP3 = p1.distanceToPoint(p3);
		double distanceP2ToP4 = p2.distanceToPoint(p4);
		
		// Side lengths
		double distanceP1ToP2 = p1.distanceToPoint(p2);
		double distanceP2ToP3 = p2.distanceToPoint(p3);
		double distanceP3ToP4 = p3.distanceToPoint(p4);
		double distanceP1ToP4 = p1.distanceToPoint(p4);
		
//		System.out.print(this.toString());
//		System.out.println("distanceP1ToP2: " + distanceP1ToP2);
//		System.out.println("distanceP1ToP3: " + distanceP1ToP3);
//		System.out.println("distanceP1ToP4: " + distanceP1ToP4);
//		
//		System.out.println("p1->p2: " + distanceP1ToP2);
//		System.out.println("p2->p3: " + distanceP2ToP3);
//		System.out.println("p3->p4: " + distanceP3ToP4);
//		System.out.println("p4->p1: " + distanceP1ToP4);
//		System.out.println();
		
		return this.isEqual(distanceP1ToP3, distanceP2ToP4)
				&& this.isEqual(distanceP1ToP2, distanceP2ToP3)
				&& this.isEqual(distanceP3ToP4, distanceP1ToP4);
	}
	
	public boolean isRectangle() {
		if (this.isSquare()) {
			return false;
		}
		
		double distanceP1ToP3 = p1.distanceToPoint(p3);
		double distanceP2ToP4 = p2.distanceToPoint(p4);
		
		return this.isEqual(distanceP1ToP3, distanceP2ToP4);
	}
	
	public boolean isRhombus() {
		return !this.isRectangle() && !this.isSquare();
	}
	
	public boolean isParallelogram() {
		System.out.println(this.toString());
		return this.isEqual(this.p1.slopeBetweenPoint(p2), this.p3.slopeBetweenPoint(p4));
	}
	
	public boolean isTrapezoid() {
		return false;
	}
	
	public static void main(String[] args) {
//		if (this.isRectangle()) {
//			
//		}
 	}
	
	private boolean isEqual(double a, double b) {
		return (Math.abs(a - b)) < EPSILON;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("p1: ");
		builder.append(p1.toString());
		builder.append("\n");
		
		builder.append("p2: ");
		builder.append(p2.toString());
		builder.append("\n");
		
		builder.append("p3: ");
		builder.append(p3.toString());
		builder.append("\n");
		
		builder.append("p4: ");
		builder.append(p4.toString());
		builder.append("\n");
		
		return builder.toString();
	}
}
