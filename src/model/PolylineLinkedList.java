package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class PolylineLinkedList {
	private LinkedList<Point> list;
	
	public PolylineLinkedList() {
		this.list = new LinkedList<>();
	}
	
	public PolylineLinkedList(LinkedList<Point> list) {
		Objects.requireNonNull(list);
		this.list = new LinkedList<>();
		this.add(list);
	}
	
	public PolylineLinkedList(Point p) {
		Objects.requireNonNull(p);
		this.list =new LinkedList<>();
		this.add(p);
	}
	
	public void add(Point p) {
		Objects.requireNonNull(p);
		this.list.add(p);
	}
	
	public void add(List<Point> listPoint) {
		Objects.requireNonNull(listPoint);
		this.list.addAll(listPoint);
	}
	
	public int nbPoints() {
		return this.list.size();
	}
	
	public boolean contains(Point p) {
		Objects.requireNonNull(p);
		return this.list.contains(p);
	}

}

