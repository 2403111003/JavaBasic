package chap7_04;

public class TalkableTest {
	static void speak(Talkble a) {
		a.talk();
	}
	public static void main(String[] agrs) {
		speak(new Korean());
		speak(new American());
	}
}
