package Array.EX;


import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] Scores = new int[4][3];
        String[] Subject = {"국어", "수학", "영어"};

        int totalScore = 0;
        double average = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요 : ");
            for (int j = 0; j < 3; j++) {
                System.out.print(Subject[j] + "점수 : ");
                Scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                totalScore += Scores[i][j];
            }
            average = (double) totalScore /3;
            System.out.println( (i+1) + "의 학생의 총접 : " + totalScore + ", 평균 : " + average);
        }
    }
}
