package Array.EX;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] Subject = {"국어" , "영어" , "수학"};

        int sum = 0;
        double average =0;

        System.out.print("학생수를 입력하세요 : ");
        int count = scanner.nextInt();

        int[][] scores = new int[count][3];

        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");
            for (int j = 0; j < 3; j++) {
                System.out.print(Subject[j] + "점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < count; i++) {
            sum = 0 ;
            for (int j = 0; j < 3; j++) {
                sum += scores[i][j];
            }
            average = (double) sum / 3;
            System.out.println((i+1) + "번 학생의 총점 : " + sum + ", 평균 : " + average);
        }
    }
}
