package Scanner.EX;

import java.util.Scanner;

public class ScannerEX3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("음식의 이름을 입력해주세요 : ");
        String foodName = input.nextLine();

        System.out.print("음식의 가격을 입력해주세요 : ");
        int foodPrice = input.nextInt();

        System.out.print("음식의 수량을 입력해주세요 : ");
        int foodQuantity = input.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.print(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "입니다.");

    }
}
