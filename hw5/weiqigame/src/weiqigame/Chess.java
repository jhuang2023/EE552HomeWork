package weiqigame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Chess {
	private int x,y;
	//private ArrayList<x,y> 
	private ArrayList<Point> points;
	public Chess() {
		
//        MyMouseListener ml = new MyMouseListener();
//        addMouseListener(ml);		
        addMouseListener(new MouseAdapter() {
            
            public void mousePressed(MouseEvent e) {
                points.add(new Point(e.getX(), e.getY()));
                repaint();
            }
        });
//		points = new ArrayList<Point>();
//		 addMouseListener(); 

	}
	

		
	}

	
	
		

	
}
