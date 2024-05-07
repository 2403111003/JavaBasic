package chap7_06;

public class HumanTest {
	public static void main(String[] agrs) {
		Human.echo();
		
		Student s = new Student(20);
		s.print();
		s.eat();
		
		Human p = new Worker();
		p.print();
		p.eat();
	}
}
