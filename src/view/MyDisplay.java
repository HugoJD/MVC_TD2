package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class MyDisplay extends JPanel implements Observer{
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Avance - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDisplay d = new MyDisplay();
		frame.add(d);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawLine(50, 50, 250, 250);
		System.out.println("drawLine");
	}

	@Override
	public void update(Observable o, Object arg) {
		//TODO();
		
	}
}
