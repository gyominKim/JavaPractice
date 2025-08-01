package Class1.Ex;

import java.security.Key;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder Order1 = new ProductOrder();
        Order1.ProductName = "두부";
        Order1.price = 200;
        Order1.quantity = 2;
        productOrders[0] = Order1;

        ProductOrder Order2 = new ProductOrder();
        Order2.ProductName = "김치";
        Order2.price = 5000;
        Order2.quantity = 1;
        productOrders[1] = Order2;

        ProductOrder Order3 = new ProductOrder();
        Order3.ProductName = "콜라";
        Order3.price = 1500;
        Order3.quantity = 2;
        productOrders[2] = Order3;


        int totalAmount = 0;

        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명:" +productOrder.ProductName + ", 가격:" + productOrder.price + ", 수량: " + productOrder.quantity);
            totalAmount += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액 : " + totalAmount);
       /* for (int i = 0; i < productOrders.length; i++) {
            System.out.println("상품명:" +productOrders[i].ProductName + ", 가격:" + productOrders[i].price + ", 수량: " + productOrders[i].quantity);
            totalAmount += productOrders[i].price * productOrders[i].quantity;
        }
        System.out.println("총 결제 금액 : " + totalAmount );*/

    }
}
