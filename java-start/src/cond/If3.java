package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 5;

        if(age<=7){ //조건을 만족해도 불필요하게 계속 그 다음 조건을 검사함
            System.out.println("미취학");
        } if (8<=age&& age<=13) { //8살인 초등학생 얘는 이미 미취학이고 조건을 이미 체크함 첫번째 조건문에서 두번째 조건문이랑 첫번째 조건문 중복 조건문 같음
            System.out.println("초등학생");
        } if (14 <= age && age <= 16) {
            System.out.println("중학색");
        }if (17 <= age && age <= 19) {
            System.out.println("고등학생");
        }if (20 <= age) {
            System.out.println("성인");
        }

    }
}
