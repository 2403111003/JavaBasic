package chap6_03;

public class MovablePoit extends Point{
	private int xSpeed;
	private int ySpeed;
	MovablePoit(int x, int y,int xSpeed,int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	int getXSpeed(){
		return xSpeed;
	}
	int getYSpeed(){
		return ySpeed;
	}
	void setXSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	void setYSpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	@Override
	public String toString() {
		return "MovePoint [ X = "+getX()+", Y = "+getY()+", XSpeed = "+getXSpeed()+", YSpeed = "+getYSpeed()+" ]";
	}
}
