package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array02 {
	public static void main(String[] agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("학생 수 : ");
		int A = Integer.parseInt(br.readLine());

		System.out.print(A + "명의 성적 : ");
		String inStr = br.readLine();

		StringTokenizer st = new StringTokenizer(inStr, " ");
		int[] scores = new int[A];

		int sum = 0;
		int average = 0;

		for (int i = 0; i < scores.length; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
			sum += scores[i];
			average = sum / scores.length;
		}
		System.out.println(">> 합계: " + sum);
		System.out.println(">> 평균: " + average);
	}

}
