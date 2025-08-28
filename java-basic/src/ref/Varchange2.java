package ref;

public class Varchange2{
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; //참조값만 읽어서 dataB에 들어가는 것

        System.out.println("dataA 참조값 = " + dataA); //dataA.value값의 주소
        System.out.println("dataB 참족밧 = " + dataB); //dataB.value값의 주소
        System.out.println("dataA.value = " + dataA.value); //dataA.value 값 10
        System.out.println("dataB.value = " + dataB.value); //dataB.value 값 10

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); //20

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); //30
        System.out.println("dataB.value = " + dataB.value); // 30

    }
}
