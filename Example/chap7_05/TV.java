package chap7_05;

public class TV extends Controller{
	@Override
	String getName() {
		return "TV";
	}
	public TV(boolean power) {
		super(power);
	}
}
