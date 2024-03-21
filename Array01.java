package array;

public class Array01 {
	public static void main(String[] agrs) {
		int[] gradArr = {90,70,80,79,82,50,70,90,89,89};
		int sum = 0;
		int average = 0;
		for (int i = 0; i < gradArr.length; i++) {
			sum += gradArr[i];
			average = sum/gradArr.length;
		}
		System.out.println(">> 합계: "+sum);
		System.out.println(">> 평균: "+average);
	}

}
