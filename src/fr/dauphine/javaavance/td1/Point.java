package fr.dauphine.javaavance.td1;

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
		this.x = p2.x;
		this.y = p2.y;
		compteur+=1;
	}
	
	public void method() {
		Point p = new Point(0,0);
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
}
