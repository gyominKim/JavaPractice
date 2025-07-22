package Operator1;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a+b;
        System.out.println("a+b = " + sum); // 출력 : a + b = 7

        //뺄셈
        int diff = a - b;
        System.out.println("a-b = "+diff);

        //곱셉
        int multi = a*b;
        System.out.println("a*b = "+multi);


        //만약 b를 0으로 바꾸면 오류가 발생해서 프로그램 종료
        //나눗셈
        int div = a/b; //2.5 int형끼리 계산해서 소숫점이 표현 안된다
        System.out.println("a/b = "+div);

        //나머지
        int mod = a % b;
        System.out.println("a%b = " +mod);

       /* int z = 10 / 0;
        //0으로 나눈거 예외가 발생함*/



    }
}
