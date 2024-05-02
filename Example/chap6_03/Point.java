package chap6_03;

public class Point {
	private int x;
	private int y;
	
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	void setX(int x) {
		this.x = x;
	}
	void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [ x = " +x+", y = "+y+" ]";
	}
}
