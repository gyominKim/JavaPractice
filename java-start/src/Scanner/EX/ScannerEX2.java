package Scanner.EX;

import java.util.Scanner;

public class ScannerEX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 : ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.print("입력하신 정수는 짝수입니다");
        }else {
            System.out.print("입력하신 정수는 홀수입니다");
        }
    }
}
