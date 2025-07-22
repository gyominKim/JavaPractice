package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값 int형
        long maxIntOver = 2147483648L; //int 최고값 + 1초과함
        int intValue  = 0;

        intValue = (int) maxIntValue;//형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting =" + intValue);
        //int를 넘었더니 가장작은 범위부터 다시 시작하는걸 overflow
        //long을 int에 넣으려면 무조건 casting
    }
}
