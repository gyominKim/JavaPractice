package Scanner.EX;

import java.util.Scanner;

public class ScannerEX7 {
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

        System.out.print(num1 + "보다 크고 " + num2 + "보다 작은 짝수들 : ");
        for(int i = num1; i <= num2; i++){
            if(i % 2 == 0){
                System.out.print(i);
                if(i != num2){
                    System.out.print(",");
                }
            }
        }
    }
}
