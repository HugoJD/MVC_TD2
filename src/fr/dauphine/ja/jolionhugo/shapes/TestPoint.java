package fr.dauphine.ja.jolionhugo.shapes;

import java.util.ArrayList;

import model.Circle;
import model.Point;
import model.Ring;

public class TestPoint {

	public static void main(String[] args) {
		/*Point p = new Point();
		System.out.println(p.x + " " + p.y); // Ne fonctionne pas parce que x et y sont des attributs priv�s
		*/
		
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);
		
		System.out.println(p1 == p2); // true ==> p1 et p2 pointent vers le m�me objet
		System.out.println(p1 == p3); //false ==> p1 et p3 ne pointent pas vers le m�me objet
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
		Polyline polyline = new Polyline(3);
		polyline.add(p1);
		polyline.add(p3);
		polyline.add(new Point(2,3));
		//polyline.add(new Point(1,4));
		//polyline.add(null);
		
		Point p=new Point(1,2); 
		Circle c=new Circle(p,1); 
		Circle c2=new Circle(p,2); 
		c2.translate(1,1); 
		System.out.println(c+" "+c2);
		
		Circle circle =new Circle(new Point(1,2), 1);
		//System.out.println(circle);
		circle.getCenter().translate(1,1); 
		System.out.println(Circle.contains(new Point(2,3), circle));
		
		Point centre = new Point(2,2);
		Ring ring = new Ring(centre, 2, 4);
		System.out.println(ring);
		System.out.println(ring.contains(new Point(1,5)));
	
	
	}

}
