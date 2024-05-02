package chap6_05;

public class SmartPhone extends Telephone {
	private String game;
	SmartPhone(String owner,String game) {
		super(owner,"when");
		this.game = game;
	}
	void playGame() {
		System.out.println(owner+"가 "+game+" 게임을 하는 중이다.");		
	}
}
