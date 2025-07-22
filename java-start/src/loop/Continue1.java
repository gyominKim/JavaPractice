package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        // i = 1,2,3,4,5, 6이 되는 순간 거짓이 되어서 while문 종료
        while (i <=5){
            if ( i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
