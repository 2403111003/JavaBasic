package chap6_01;

public class Main {
	public static void main(String[] agrs) {
		Circle c1 = new Circle(5);
		ColoredCircle c2 = new ColoredCircle(10,"빨간색");
		
		c1.show();
		c2.show();
	}
}
