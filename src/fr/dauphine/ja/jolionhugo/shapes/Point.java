package fr.dauphine.ja.jolionhugo.shapes;

import java.util.Objects;

public class Point {
	
	private int x;
	private int y;
	private static int compteur = 0;
	
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		compteur+=1;
	}
	
	public Point(Point p2) {
		Objects.requireNonNull(p2);
		this.x = p2.x;
		this.y = p2.y;
		compteur+=1;
	}
	
	public void method() {
		Point p = new Point(1,2);
		System.out.println(p.x + " " + p.y);
	}
	
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	
	@Override
	public String toString() {
		return this.x + " " + this.y;
	}
	
	public static int getCompteur() {
		return compteur;
	}
	
	public boolean isSameAs(Point p1) {
		Objects.requireNonNull(p1);
		if(this.x == p1.getX() && this.y == p1.getY()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int hash = 31;
		int result = 1;
		result = hash * result + this.x;
		result = hash * result + this.y;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Point p = (Point) obj;
		if (this.x != p.getX()) {
			return false;
		}
		if (this.x != p.getX()) {
			return false;
		}
		if (this.y != p.getY()) {
			return false;
		}
		return true;
	}
	
	public void translate(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}

}
