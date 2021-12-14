package model;

import java.util.Objects;

public class Circle {
	private Point center;
	private int radius;
	
	public Circle(Point center, int radius) {
		if(radius<=0) {
			throw new IllegalArgumentException("Le rayon d'un cercle ne peut �tre n�gatif.");
		}
		Objects.requireNonNull(center);
		this.center=new Point(center.getX(), center.getY());
		this.radius=radius;
	}
	
	@Override
	public String toString() {
		return "Cercle : centre = " + this.center + " et rayon = " + this.radius + " et d'aire = " + this.area();
	}
	
	public Point getCenter() {
		return new Point(this.center.getX(), this.center.getY());
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return this.radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}
	
	public double area() {
		return 2*Math.PI*this.radius;
	}
	
	public boolean contains(Point p) {
		Objects.requireNonNull(p);
		double isIn = Math.sqrt((Math.pow(p.getX()-center.getX(), 2.0)+Math.pow(p.getY()-center.getY(), 2.0)));
		if(isIn>this.radius) {
			return false;
		}
		return true;
	}
	
	public static boolean contains(Point p, Circle...circles) {
		Objects.requireNonNull(p);
		Objects.requireNonNull(circles);
		for(Circle c : circles) {
			if(c.contains(p)){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int hash = 31;
		int result = 1;
		result = hash * result + ((center == null) ? 0 : center.hashCode());
		result = hash * result + radius;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle circle = (Circle) obj;
		if (center == null) {
			if (circle.center != null)
				return false;
		} else if (!center.equals(circle.center))
			return false;
		if (radius != circle.radius)
			return false;
		return true;
	}

}
