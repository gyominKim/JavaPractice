package Array.EX;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);




    }
}
