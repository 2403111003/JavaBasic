package chap6_04;

public class OvershadowTest {
	public static void main(String[] agrs) {
		Parent p = new Child();
		System.out.println(p.name);
		p.print();
	}
}
