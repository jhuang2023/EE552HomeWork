package drawapp;
import javax.swing.*;

import drawapp.component.*;

import java.awt.event.*;


public class ModalButton extends JButton {
    private Mode m;
    private DrawArea da;
    public ModalButton(String text, DrawArea da, Mode m) {
        super(text); // call parent constructor
        this.m = m;
        this.da = da;
        addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    da.setMode(m);
                }
        });
    }
    
}






//public class ModalButton extends JButton{
//	private Mode m;
//	private DrawArea da;
//	public ModalButton(String text, DrawArea da, Mode m) {
//		super(text);
//		this.m = m;
//		this.da = da;
//		addActionListener(
//				new ActionListener() {
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						// TODO Auto-generated method stub
//						da.setMode(m);
//					}
//				}
//				);
//	}
//
//}
