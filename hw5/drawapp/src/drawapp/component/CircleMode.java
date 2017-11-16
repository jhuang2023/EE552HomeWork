package drawapp.component;

public class CircleMode implements Mode{
	@Override
	public Shape creat(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		return new Circle (x1,y1,x2-x1,y2-y1);//??????
	}
}
