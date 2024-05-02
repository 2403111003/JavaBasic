package chap6_05;

public class Phone {
	protected String owner;
	Phone(String owner){
		this.owner = owner;
	}
	void talk() {
		System.out.println(owner+"가 통화중이다.");
	}
}
