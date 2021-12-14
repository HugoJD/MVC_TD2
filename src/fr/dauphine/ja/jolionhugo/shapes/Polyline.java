package fr.dauphine.ja.jolionhugo.shapes;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Polyline {
	private final int capacity;
	private Point tab[];
	private int index;
	
	public Polyline(int capacity) {
		if(capacity<=0) {
			throw new IllegalArgumentException("La capacit� ne peut �tre n�gative");
		}
		this.tab = new Point[capacity];
		this.capacity = capacity;
		this.index = 0;
	}
	
	
	public void add(Point p) {
		Objects.requireNonNull(p);
		this.tab[this.index] = p;
		++this.index;
	}
	
	public int pointCapacity() {
		return this.capacity;
	}
	
	public int nbPoints() {
		return this.tab.length;
	}
	
	public boolean contains(Point p1) {
		Objects.requireNonNull(p1);
		for (Point p : this.tab) {
			if(p.equals(p1)) {
				return true;
			}
		}
		return false;
	}
}
