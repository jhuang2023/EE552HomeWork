package weiqigame;
import java.awt.*;
import javax.swing.*;

//Draw checkerbord

public class Checkers extends JFrame {
	private int x, y;
	class Mybord extends JPanel{
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for( x=0; x<=19;x+=1) {			
				for (y=0;y<=19;y+=1) {					
					if((x%2)==(y%2)) {
						System.out.println(x); 
						System.out.println(y);
						g.setColor(Color.BLACK);
						g.fillRect(x*10,y*10,10,10);
					}
					else {
						System.out.println(x); 
						System.out.println(y);
						g.setColor(Color.WHITE);
						g.fillRect(x*10,y*10,10,10);
					}					
				}	
			}			
	}
}
	
	public Checkers() {
		Mybord b = new Mybord();
		Container c = getContentPane();
		c.add(b);
		setSize(190,190);
		setVisible(true);
		
	}
	

}
