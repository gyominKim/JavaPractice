package Scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자에 0을 입력하면 프로그램이 종료됩니다.");

        while(true){

            System.out.print("첫 번째 숫자 : ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자 : " );
            int num2 = scanner.nextInt();

            if(num1 == 0 && num2 ==0) {
                System.out.print("프로그램이 종료됩니다.");
                break;
            }
            int sum = num1 + num2;

            System.out.println("두 숫자를 더한 값은 " + sum + "입니다");

        }
    }
}
