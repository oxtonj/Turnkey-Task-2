import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;


public class Task2Part2 extends JPanel {

@Override	
public void paint(Graphics tri){
		
		tri.drawLine(10, 10, 40, 60);
		tri.drawLine(40, 60, 100, 10);
		tri.drawLine(10, 10, 100, 10);
		
		tri.drawLine(310, 10, 340, 120);
		tri.drawLine(340, 120, 400, 10);
		tri.drawLine(310, 10, 400, 10);
		
		tri.drawLine(10, 200, 150, 400);
		tri.drawLine(150, 400, 300, 200);
		tri.drawLine(10, 200, 300, 200);
		
	}

public static void main(String[] args){
	JFrame frame= new JFrame();
	
	frame.getContentPane().add(new Task2Part2());
	frame.setSize(700, 600);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);		

}

}
