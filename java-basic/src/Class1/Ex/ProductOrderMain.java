package Class1.Ex;

import java.security.Key;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder orders1 = new ProductOrder();
        orders1.ProductName = "두부";
        orders1.price = 2000;
        orders1.quantity = 2;
        orders[0] = orders1;

        ProductOrder orders2 = new ProductOrder();
        orders2.ProductName = "김치";
        orders2.price = 5000;
        orders2.quantity = 1;
        orders[1] = orders2;

        ProductOrder orders3 = new ProductOrder();
        orders3.ProductName = "콜라";
        orders3.price = 1500;
        orders3.quantity = 2;
        orders[2] = orders3;


        int totalAmount = 0;

       /* for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.ProductName + ", 가격 : " +order.price + ", 수량 : " + order.quantity);
            totalAmount += order.price * order.quantity;
        }
        System.out.println("총 결제 금액 : " + totalAmount);*/
        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품명 : " + orders[i].ProductName + ", 가격 : " + orders[i].price + ", 수량 : " + orders[i].quantity);
            totalAmount += orders[i].price * orders[i].quantity;
        }
        System.out.println("총 결제 금액 : " + totalAmount);
    }
}
