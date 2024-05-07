package chap7_06;

class Worker implements Human {
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}

	@Override
	public void print() {
		System.out.println("인간입니다.");
		
	}
}
