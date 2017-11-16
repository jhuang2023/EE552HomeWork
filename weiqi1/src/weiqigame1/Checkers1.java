package weiqigame1;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;



public class Checkers1 extends JFrame{
	private int[][]location = new int[900][900];

	class Mybord extends JPanel{
		private int x, y;
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			for( x=0; x<=19;x+=1) {			
				for (y=0;y<=19;y+=1) {					
					if((x%2)==(y%2)) {

						g.setColor(Color.BLACK);
						g.drawRect(x*40,y*40,40,40);
					}
					else {
						g.setColor(Color.BLACK);
						g.drawRect(x*40,y*40,40,40);
					}					
				}	
			}			
	}

		
}
	
	public Checkers1() {
		

		Mybord b = new Mybord();
		Container c = getContentPane();
		c.add(b);
        MyMouseListener ml = new MyMouseListener();
        addMouseListener(ml);

		setSize(900,900);
		setVisible(true);
		
	}
	
	
	
	class MyMouseListener implements MouseListener{
		private int i =0;
		private int x,y;
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			i+=1;
			Graphics g = getGraphics();

			x=e.getX()/40*40;
			y=e.getY()/40*40;
			if(location[x][y]==0){
			if (i%2 ==0) {
			g.setColor(Color.WHITE);
			
			g.fillOval(x, y, 40,40);}
			else {
			g.setColor(Color.BLACK);
			
			g.fillOval(x, y, 40,40);}
			location[x][y]=1;			
		}

		}
			
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	

	
}
