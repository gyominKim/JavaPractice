package Scanner.EX;

import java.util.Scanner;

public class ScannerEX8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp = 0;

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = input.nextInt();
        input.nextLine();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = input.nextInt();
        input.nextLine();

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int sum = 0;
        for(int i =num1; i <= num2; i++){
            sum += i;
        }
        System.out.print(num1 + "보터 " + num2 + "까지의 정수의 합 : " + sum);
    }
}
