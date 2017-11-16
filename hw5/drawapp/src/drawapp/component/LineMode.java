package drawapp.component;

public class LineMode implements Mode{

	@Override
	public Shape creat(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		return new Line (x1,y1,x2,y2);
	}

}
