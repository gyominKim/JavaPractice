package Operator1;

public class operator2 {
    public static void main(String[] args) {

        //문자열과 문자열 더하기 1
        String result1 = "hello" + "World";
        System.out.println(result1);

        //문자열과 문자열 더하기 2
        String s1 = "String1";
        String s2 = "String2";
        String result2 = s1 + s2; //s1에는 String1이 저장 s2에는 String2가
        System.out.println(result2);

        //문자열과 솟자 더하기1
        String result3 = "a + b = " + 10;
        System.out.println(result3);
        //문자열에 숫자 더하는거 안된다 문자랑 숫자 더했네 숫자를 문자열로 변환함 그 뒤에 걍 붙이는 거

        //문자열과 숫자 더하기 2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
        //num을 문자열로 변경해버림
        

    }
}
