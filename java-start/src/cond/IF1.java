package cond;

public class IF1 {
    public static void main(String[] args) {
        int age = 10; //사용자 나이

        if(age >= 18) {
            System.out.println("성인입니다");
        }

        if (age < 18) {
            System.out.println("미성년자입니다.");
        }
    }
}
