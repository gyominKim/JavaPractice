package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); //하나를 import하면 다른 하나는 풀네임으로 작성
    }
}
