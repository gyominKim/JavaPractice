package casting;

public class Casting2 {
    public static void main(String[] args) {

        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류 발생 타입이 안 맞고 더블을 인트로 안된다

        //더블은 소수점도 있는데 인트는 그런거 없음
        //소수데이터 필요없고 그냥 대략적으로 보고싶다
        intValue = (int) doubleValue; //형변환 -> 명시적형변환
        System.out.println(intValue);
        System.out.println((int) 10.5);

        System.out.println("doubleValue = "+ doubleValue);
    }
}
