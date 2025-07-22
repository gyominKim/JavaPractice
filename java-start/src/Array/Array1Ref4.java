package Array;

public class Array1Ref4 {
        public static void main(String[] args) {

            int[] students = {90, 80, 70, 60, 50}; //배열 생성과 초기화

            System.out.println(students.length);

            //변수 값 사용
            for (int i = 0; i < students.length; i++) {
                System.out.println("학생" + (i+1) + "점수:" + students[i]);
                //문자 + 숫자는 문자가 된다 i랑 1 사이에 괄호 없으면 걍 문자로 인식된다
            }
        }
    }

