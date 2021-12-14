package fr.dauphine.ja.jolionhugo.shapes;

import java.util.Objects;

public class Ring {
	private Circle innerCircle;
	private Circle outerCircle;
	
	public Ring(Point center, int innerRadius, int outerRadius) {
		if((innerRadius<=0 || outerRadius<=0)||
				innerRadius>outerRadius) {
			throw new IllegalArgumentException();
		}
		Objects.requireNonNull(center);
		this.innerCircle=new Circle(center, innerRadius);
		this.outerCircle=new Circle(center, outerRadius);
	}

	@Override
	public String toString() {
		return "innerCircle :" + this.innerCircle.toString() + "\n"
				+ "outerCircle :"+ this.outerCircle.toString();
	}

	public boolean contains(Point p) {
		Objects.requireNonNull(p);
		if(Circle.contains(p, this.outerCircle) && 
				!Circle.contains(p, this.innerCircle)){
			return true;
		}
		return false;
	}
	
	public static boolean contains(Point p, Ring...rings) {
		Objects.requireNonNull(p);
		Objects.requireNonNull(rings);
		for(Ring r : rings) {
			if(r.contains(p)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int hash = 31;
		int result = 1;
		result = hash * result + ((innerCircle == null) ? 0 : innerCircle.hashCode());
		result = hash * result + ((outerCircle == null) ? 0 : outerCircle.hashCode());
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
		Ring ring = (Ring) obj;
		if (innerCircle == null) {
			if (ring.innerCircle != null)
				return false;
		} else if (!innerCircle.equals(ring.innerCircle))
			return false;
		if (outerCircle == null) {
			if (ring.outerCircle != null)
				return false;
		} else if (!outerCircle.equals(ring.outerCircle))
			return false;
		return true;
	}
}
