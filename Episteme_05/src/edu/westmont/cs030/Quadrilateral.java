package edu.westmont.cs030;

import java.util.Scanner;

/**
 * @author john
 * @contact jpanos@westmont.edu
 * Date: Feb 13, 2020
 */
public class Quadrilateral {
    static class Point {
        private double x;
        private double y;

        /**
         * Defines a two dimensional point
         *
         * @param x The point on the horizontal axis
         * @param y The point on the vertical axis
         */
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        /**
         * Find the distance from the point
         *
         * @param point The point to find the distance from
         * @return Distance to the points
         */
        public double distanceToPoint(Point point) {
            return Math.sqrt(
                    Math.pow((point.getX() - this.getX()), 2) +
                    Math.pow((point.getY() - this.getY()), 2)
            );
        }

        /**
         * Find the slope between the points
         *
         * @param point The point to find the slope from
         * @return The slope between the points
         */
        public double slopeBetweenPoint(Point point) {
            return (point.getY() - this.getY()) / (point.getX() - this.getX());
        }

        /**
         * Gets the point on the horizontal axis
         *
         * @return the point on the horizontal axis
         */
        public double getX() {
            return this.x;
        }

        /**
         * Gets the point on the vertical axis
         *
         * @return the point on the vertical axis
         */
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

    /**
     * Checks to see if the Quadrilateral instance is a square
     *
     * @return if the Quadrilateral is a square
     */
    public boolean isSquare() {

        if (!this.isRectangle()) {
        	System.out.println("The square does not have 90 degree corners");
            return false;
        }

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

//		this.allSidesProduceRightAngle(p1, p2);

        return this.isEqual(distanceP1ToP2, distanceP2ToP3)
                && this.isEqual(distanceP3ToP4, distanceP1ToP4)
                && this.isEqual(distanceP1ToP4, distanceP1ToP2);
    }

    /**
     * Checks to see if the Quadrilateral instance is a rectangle
     *
     * @return if the Quadrilateral is a rectangle
     */
    public boolean isRectangle() {
        System.out.println(this.getAngleBetweenPoints(p1, p2));
        System.out.println(this.getAngleBetweenPoints(p3, p4));

        return this.isEqual(
                Math.abs(this.getAngleBetweenPoints(p1, p2)),
                90.0) && this.isEqual(
                Math.abs(this.getAngleBetweenPoints(p3, p4)),
                90.0);
    }

    /**
     * Checks to see if the Quadrilateral instance is a rhombus
     *
     * @return if the Quadrilateral is a rhombus
     */
    public boolean isRhombus() {
        return !this.isRectangle() && !this.isSquare();
    }

    /**
     * Checks to see if the Quadrilateral instance is a parallelogram
     *
     * @return if the Quadrilateral is a parallelogram
     */
    public boolean isParallelogram() {
        return this.isEqual(this.p1.slopeBetweenPoint(p2), this.p3.slopeBetweenPoint(p4));
    }

    /**
     * Checks to see if the Quadrilateral instance is a trapezoid
     *
     * @return if the Quadrilateral is a trapezoid
     */
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

    private double getAngleBetweenPoints(Point p1, Point p2) {
        return Math.toDegrees(Math.atan2(p2.getY() - p1.getY(), p2.getX() - p1.getX()));
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
