package extends1.ex4.ex_1;

public class Item {
    /*부모 클래스*/

    private String name;
    private int price;


    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    int getPrice() {
        return price;
    }

    void print() {
        System.out.println("이름 : " + name + ", 가격 : " + price);
        return;
    }
}
