package drawapp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import drawapp.component.CircleMode;
import drawapp.component.LineMode;
import drawapp.component.RectMode;

public class DrawApp extends JFrame {
	private boolean dirty;
	private DrawArea da;
	private void buildToolbar(Container c) {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 1));
		JButton b;
		dirty = true;
		p.add(b=new JButton("line"));
                b.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        da.setMode(new LineMode());
                    }
                });
		p.add(b=new ModalButton("ellipse", da, new CircleMode()));
                
		p.add(b=new ModalButton("rect", da, new RectMode()));
		c.add(p, BorderLayout.WEST);
	}

	private void handleEvents() {
		addWindowListener(new WindowListener() {

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				int result = JOptionPane.showConfirmDialog(DrawApp.this, "Quit?",
				        "alert", JOptionPane.OK_CANCEL_OPTION);
				System.out.println(result);
				if (result == 0)
					System.exit(0);
				setVisible(true);
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	public void save() {
		
		dirty=false;
	}
	public DrawApp( ) {
		Container c = getContentPane();
		da = new DrawArea();
		buildToolbar(c);
		handleEvents();
		c.add(da, BorderLayout.CENTER);
		setSize(700,400);
		setVisible(true);
	}
}
//public class DrawApp extends JFrame{
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private DrawArea da;
//	private boolean dirty;
//	
//	private void buildToolbar(Container c) {
//		JPanel p = new JPanel();
//		p.setLayout(new GridLayout(3,1));
//		ModalButton b;
//		dirty = true;
//		p.add(c,b = new ModalButton("line", da, new LineMode()));
//		p.add(c,b = new ModalButton("ellipse", da, new CircleMode()));
//		p.add(c,b = new ModalButton("rect", da, new CircleMode()));
//		c.add(p,BorderLayout.WEST);//??????
//
//	}
//	public void save() {
//		dirty = false;
//	}
//	private void handleEvents() {
//		addWindowListener(new WindowListener() {
//
//			@Override
//			public void windowActivated(WindowEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowClosing(WindowEvent e) {
//				// TODO Auto-generated method stub
//				int result = JOptionPane.showConfirmDialog(DrawApp.this, "Quit?","alert",JOptionPane.OK_CANCEL_OPTION);
//				System.out.println(result);
//				System.exit(0);
//			}
//
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		});
//	}
//	
//	public DrawApp() {
//		Container c = getContentPane();
//		da = new DrawArea();
//		buildToolbar(c);//????????
//		handleEvents();
//
//		c.add(da, BorderLayout.CENTER);
//		setSize(700,400);
//		setVisible(true);
//		
//		
//	}
//
//}
