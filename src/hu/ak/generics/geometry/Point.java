package hu.ak.generics.geometry;

import java.util.Objects;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return ("(" + x + ", " + y + ")");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Point)) {
			return false;
		}
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	public static double distance(Point point1, Point point2) {

		double distance = Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));

		return distance;
	}

}
