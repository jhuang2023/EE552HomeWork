package drawapp.component;
import java.awt.*;


public abstract class Shape {
	private int x, y;
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public abstract void draw(Graphics g);
	public int getx() {return x;}
	public int gety() {return y;}
	
	public abstract void setPoint2(int x2, int y2);
	
}
