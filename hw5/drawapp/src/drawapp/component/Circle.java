package drawapp.component;
import java.awt.*;

public class Circle extends Shape {
	private int w, h;
	
	public Circle(int x, int y, int w, int h) {
		super(x, y);
		this.w=w;this.h=h;
	}
	



	@Override
	public void draw(Graphics g) {
		g.fillOval(getx(), gety(), w, h);	
		
	
	}
	
	public void setPoint2(int x2, int y2) {
		w = x2 - getx();
		h = y2 - gety();
	}
	
}
