package Poly.ex.pay1;

public class DefaultPay implements pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("잘못된 결제 수단입니다");
        return true;
    }
}
