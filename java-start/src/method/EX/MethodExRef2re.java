package method.EX;

public class MethodExRef2re {
    public static void main(String[] args) {

        printMessage("Hello, World", 3);
        printMessage("안녕하세요, World", 4);
        printMessage("성준수, World", 2);


    }
    public static void printMessage(String Message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(Message);
        }
    }
}
