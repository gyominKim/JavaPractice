package Poly.ex.pay2;

public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제를 실패했습니다");
        return false;
    }
}
