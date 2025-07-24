package method.EX;

public class MethodExRef2 {
    public static void main(String[] args) {
        printMessage("Hello,World!", 3);
        printMessage("Hello,World!", 5);
        printMessage("Hello,World!", 7);
    }

    public static void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}

