package Scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.print("정수를 입력하세요 (0 입력시 종료) : ");
            int number = input.nextInt();

            if(number == 0){
                System.out.print("프로그램을 종료합니다");
                break;
            }
            sum += number;
        }
            System.out.println("정수의 총합 : " + sum );
        }
    }

