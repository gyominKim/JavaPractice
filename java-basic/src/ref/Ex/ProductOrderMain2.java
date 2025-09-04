package ref.Ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder productOrder1 = createOrder("두부", 2000, 2);
        ProductOrder productOrder2 = createOrder("김치", 5000, 1);
        ProductOrder productOrder3 = createOrder("콜라", 1500, 2);
        printOrders(productOrder1);
        printOrders(productOrder2);
        printOrders(productOrder3);
        getTotalAmount(productOrder1,productOrder2,productOrder3);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder productOrder) {
        System.out.println("상품명:" + productOrder.productName + " 가격:" + productOrder.price + " 수량:" + productOrder.quantity);
    }

    static int getTotalAmount(ProductOrder productOrder1, ProductOrder productOrder2, ProductOrder productOrder3) {
        int total = (productOrder1.price * productOrder1.quantity) +(productOrder2.price * productOrder2.quantity) + (productOrder3.price * productOrder3.quantity);
        System.out.println("총경제금액 : " + total);
        return total;
    }
}
