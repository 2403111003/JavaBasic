package chap6_05;

public class PhoneTest {
	public static void main(String[] agrs) {
		Phone[] phones = {new Phone("황진이"),new Telephone("길동이","내일"),new SmartPhone("민국이","갤러그")};
		
		for(Phone phone : phones) {
			if (phone instanceof SmartPhone) {
                ((SmartPhone) phone).playGame();
            } else if (phone instanceof Telephone) {
                ((Telephone) phone).autoAnswering();
            } else if (phone instanceof Phone) {
                phone.talk();
            }
		}
	}
}
