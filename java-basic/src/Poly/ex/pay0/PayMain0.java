package Poly.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2,amount2);

        String payOption4 = "NewPay";
        int amount4 = 18000;
        payService.processPay(payOption4,amount4);

        //잘못된 결제 수단 선택
        String payOprion3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOprion3, amount3);
    }
}
