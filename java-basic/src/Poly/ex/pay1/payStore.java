package Poly.ex.pay1;

public class payStore {

    //결제 수단 추가시 변하는부분
    public static pay findPay(String option) {
        if (option.equals("kakao")) {
           return new Kakaopay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else{
            return new DefaultPay();
        }
    }
}
