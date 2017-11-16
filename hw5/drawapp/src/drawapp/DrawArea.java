package drawapp;
import drawapp.component.CircleMode;
import drawapp.component.Line;
import drawapp.component.LineMode;
import drawapp.component.Mode;
import drawapp.component.Shape;
//import drawapp.component.Line;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;


public class DrawArea extends JPanel {

    private ArrayList<Shape> shapes;
    private Mode mode;

    public void setMode(Mode m) {
        mode = m;
    }

    public DrawArea() {
        setMode(new CircleMode());
        shapes = new ArrayList<>(1024);
        setBackground(Color.BLUE);
        MyMouseListener ml = new MyMouseListener();
        addMouseListener(ml);
        addMouseMotionListener(ml);
    }

    public void paint(Graphics g) {
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
//		super.paint(g);
//for (int i = 0; i < shapes.size(); i++)
        //shapes.get(i).draw(g);
        System.out.println("paint: " + shapes.size());
        g.setColor(getForeground());
        for (Shape s : shapes) {
            s.draw(g);
        }
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {

        private int x, y;
        private int lastx, lasty;
        private Shape current;
        @Override
        public void mouseClicked(MouseEvent arg0) {
        }

        @Override
        public void mouseEntered(MouseEvent arg0) {
            setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        }

        @Override
        public void mouseExited(MouseEvent arg0) {
            setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            lastx = x;
            lasty = y;
            current = mode.creat(x, y, e.getX(), e.getY());
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            Graphics g = getGraphics();
            g.setXORMode(Color.WHITE);
            current.draw(g);
            g.setPaintMode();
            
            current.draw(g);
            
            shapes.add(current);
//			Line line;
//			shapes.add(line =new Line(x,y, e.getX(), e.getY()));
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            Graphics g = getGraphics();
            g.setXORMode(Color.WHITE);
            current.draw(g);
            lastx = e.getX();
            lasty = e.getY();
            current.setPoint2(lastx, lasty);
            current.draw(g);
        }

        @Override
        public void mouseMoved(MouseEvent arg0) {
            // TODO Auto-generated method stub
        }

    }

}

//public class DrawArea extends JPanel {
//	private ArrayList<Shape> shapes;
//	private Mode mode;
//	private Shape current;
//	
//	public void setMode(Mode m) {
//		mode = m;
//	}
//	
//	public DrawArea() {
//		setMode(new LineMode());//the defalt mode is line
//		shapes = new ArrayList<>();
//		setBackground(Color.gray);
//		MyMouseListener ml = new MyMouseListener();
//		addMouseListener(ml);
//		addMouseMotionListener(ml);
//	}
//	
//	public void paint(Graphics g) {
//		g.setColor(getBackground());
//		g.fillRect(0, 0, getWidth(), getHeight());
//		//super.paint(g);//why add this code the background become gray and there is not the tracks of the line
//		// after reset the window to keep the shape:2 method
//		//for (int i = 0; i < shapes.size();i++)
//			//shapes.get(i).draw(g);
//		g.setColor(getForeground());
//		for (Shape s : shapes) {
//			s.draw(g);
//		}
//	}
//	
//	class MyMouseListener implements MouseListener, MouseMotionListener{
//		private int x, y;
//		private int lastx, lasty;
//		@Override
//		public void mouseClicked(MouseEvent arg0) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent arg0) {
//			// TODO Auto-generated method stub
//			setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
//		}
//
//		@Override
//		public void mouseExited(MouseEvent arg0) {
//			// TODO Auto-generated method stub
//			setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			// TODO Auto-generated method stub
//			x = e.getX(); y = e.getY();
//			lastx = x; lasty = y;
//			current = mode.creat(x,y,getX(),getY());
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			Graphics g = getGraphics();
//			g.setXORMode(Color.WHITE);
//			current.draw(g);
//			g.setPaintMode();
////			s.draw(g);
//			shapes.add(current);
////			Line line;
////			shapes.add(new Line(x, y, e.getX(), e.getY()));
////			line.draw(g);
//			
//		}
//
//		@Override
//		public void mouseDragged(MouseEvent e) {
//			// TODO Auto-generated method stub
//			Graphics g = getGraphics();
//			g.setXORMode(Color.WHITE);
//			current.draw(g);
//			lastx = e.getX();
//			lasty = e.getY();
//			current.setPoint2(lastx, lasty);
//			current.draw(g);
//			//g.drawLine(x,y,lastx,lasty);
//			//g.drawLine(x,y,lastx=e.getX(),lastx=e.getY());//?????
//			
//			
//		}
//
//		@Override
//		public void mouseMoved(MouseEvent arg0) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}
//	
//}
