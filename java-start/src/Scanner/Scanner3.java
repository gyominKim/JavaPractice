package Scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("숫자를 입력하세요 " );
        int num1 = scanner.nextInt();

        System.out.print("숫자를 입력하세요 ");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.print("더 큰 숫자는 : " + num1);
        } else if (num1 < num2){
            System.out.print("더 큰 숫자는 : " + num2);
        }else {
            System.out.print("두 숫자는 같습니다");
        }
    }
}
