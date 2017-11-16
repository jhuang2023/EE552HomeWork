package drawapp.component;

public class RectMode implements Mode{
	public Shape creat(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		return new Rect (x1,y1,x2-x1,y2-y1);
	}
}
