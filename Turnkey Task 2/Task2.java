
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;


public class Task2 extends JPanel {

@Override
public void paint(Graphics Triangle){
		
		Triangle.drawLine(0, 0, 150, 170);
		Triangle.drawLine(150, 170, 295, 0);
		Triangle.drawLine(0, 0, 295, 0);
		
	}



public static void main(String[] args){
	JFrame frame= new JFrame();
	
	frame.getContentPane().add(new Task2());
	frame.setSize(300, 200);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);		

}

}