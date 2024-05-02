package chap6_06;

public class Car extends Vehicle{
	int displacement;
	int gears;
	public Car(String color,int speed,int displacement,int gears){
		super(color,speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	@Override
	void show() {
		System.out.println("생삭 : "+color);
		System.out.println("속도 : "+speed);
		System.out.println("배기량 : "+displacement);
		System.out.println("기어 단수 : "+gears);
	}
}
