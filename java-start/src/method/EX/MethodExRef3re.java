package method.EX;

public class MethodExRef3re {
    public static void main(String[] args) {

        int result = deposit(1000, 500);
        System.out.println("======================");

        int balance = 0;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);

        System.out.println("현재 잔액은 " + balance + "원입니다.");

    }
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액 : " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
            return balance;
        } else {
            System.out.println(amount + "원 출금실패. (잔액부족)");
        }
        return balance;
    }
}