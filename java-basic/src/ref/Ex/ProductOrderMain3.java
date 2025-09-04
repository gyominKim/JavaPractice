package ref.Ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int OrderCount  = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[OrderCount];

        for (int i = 0; i < OrderCount; i++) {
            System.out.println(i+1 + "번째 주문 정보를 입력하세요");

            System.out.print("상품명 : " );
            String productName = scanner.next();

            System.out.print("가격 : ");
            int price = scanner.nextInt();

            System.out.print("수량 : ");
            int quantity = scanner.nextInt();

            orders[i] = CreateProductOrder(productName,price, quantity);
        }
        PrintProductOrder(orders);
        int total = TotalAmount(orders);
        System.out.println("총 결제 금액 : " + total);
    }
    static ProductOrder CreateProductOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void PrintProductOrder(ProductOrder[] orders) {
        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품명 : " + orders[i].productName + ", 가격 : " + orders[i].price + ", 수량 : " + orders[i].quantity);
        }
    }

    static int TotalAmount(ProductOrder[] orders) {
        int total =0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }
}
