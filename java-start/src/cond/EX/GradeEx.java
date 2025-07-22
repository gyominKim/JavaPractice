package cond.EX;

public class GradeEx {
    public static void main(String[] args) {

        String grade = "H";

        switch (grade){
            case "A":
                grade = "A";
                System.out.println("종은 성과입니다");
                break;
            case "B":
                grade = "B";
                System.out.println("좋은 수준입니다");
                break;
            case "C":
                grade = "C";
                System.out.println("준수한 성과입니다");
                break;
            case "D":
                grade = "D";
                System.out.println("향상이 필요합니다");
                break;
            case "F":
                grade = "F";
                System.out.println("불합격입니다");
                break;
            default:
                System.out.println("잘못된 학점입니다");


        }
    }
}
