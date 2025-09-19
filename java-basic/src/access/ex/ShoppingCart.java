package access.ex;

public class ShoppingCart {

    Item[] items = new Item[10];
    int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명 : " + item.getName() + ", 가격 : " + item.getTotalAmount());
        }
        System.out.println("총합계 : " + calculateTotalPrice());
    }

    public int calculateTotalPrice() {
        int totalAmount = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalAmount += item.getTotalAmount();
        }
        return totalAmount;
    }

}
