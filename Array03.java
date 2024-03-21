package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Array03 {

    public static void main(String[] args) throws IOException {
        processStudentGrades();
    }

    public static void processStudentGrades() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("학생 수: ");
        int numStudent = Integer.parseInt(br.readLine());
        System.out.println(numStudent + "명의 성적을 입력하세요: ");
        String inStr = br.readLine();

        int[] scores = readScores(inStr, numStudent);

        int sum = calculateSum(scores);
        int average = calculateAverage(scores);
        printResult(sum, average, scores.length);
    }

    public static int[] readScores(String inStr, int numStudent) {
        StringTokenizer st = new StringTokenizer(inStr, " ");
        int[] scores = new int[numStudent];
        for (int i = 0; i < numStudent; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        return scores;
    }

    public static int calculateSum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public static int calculateAverage(int[] scores) {
        int sum = calculateSum(scores);
        return sum / scores.length;
    }

    public static void printResult(int sum, int average, int numStudents) {
        System.out.println(">> 합계: " + sum + " (" + numStudents + "명)");
        System.out.println(">> 평균: " + average);
    }
}

