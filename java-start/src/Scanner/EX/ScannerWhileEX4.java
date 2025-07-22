package Scanner.EX;

import java.util.Scanner;

public class ScannerWhileEX4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        String name;
        int price = 0;
        int quantity =0;
        int totalCost = 0;



        while (true) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
            num = input.nextInt();
            input.nextLine();
            if(num == 1){
                System.out.print("상품명을 입력하세요 : " );
                name = input.nextLine();
                System.out.print("상품의 가격을 입력하세요 : ");
                price = input.nextInt();
                input.nextLine();
                System.out.print("구매 수량을 입력하세요 : ");
                quantity = input.nextInt();
                System.out.println("상품명 : " + name + " 가격 : " + price + " 수량 : " + price * quantity);
                totalCost = (price * quantity) + totalCost;
            } else if (num == 2) {
                System.out.println("총비용 : " + totalCost);
            } else if (num == 3) {

                System.out.println("프로그램을 종료합니다");
                break;
            }

        }


    }
}
