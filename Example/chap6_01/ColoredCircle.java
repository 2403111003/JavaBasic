package chap6_01;

public class ColoredCircle extends Circle{
	String color;
	ColoredCircle(int radius,String color) {
		super(radius);
		this.color = color;
	}
	void show() {
		System.out.println("반지름이 "+radius+"인 "+color+" 원 이다.");
	}
}
