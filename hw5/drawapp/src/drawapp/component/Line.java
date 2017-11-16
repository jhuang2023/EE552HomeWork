package drawapp.component;
import java.awt.*;


public class Line extends Shape {
	private int x2,y2;
	public Line(int x, int y, int x2, int y2) {
		super(x,y);
		this.x2=x2; this.y2=y2;// need construct so the next function can call the value
	}
	public void draw(Graphics g) {
		
		g.drawLine(getx(),gety(),x2,y2);
		
	}
	
	public void setPoint2(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}
}
