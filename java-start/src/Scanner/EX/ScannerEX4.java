package Scanner.EX;

import java.util.Scanner;

public class ScannerEX4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("구구단의 단 수를 입력해주세요 : ");
        int n = input.nextInt();


        System.out.println(n + "단의 구구단 " );
        for(int i = 1; i<10; i++ ){
            System.out.println( n + " X " + i + " = " + n*i);
        }
    }
}
