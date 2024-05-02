package chap6_06;

public class OverrideTest {
	public static void main(String[] agrs) {
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();
		
		System.out.println();
		
		Vehicle v = c;
		v.show();
	}
}
