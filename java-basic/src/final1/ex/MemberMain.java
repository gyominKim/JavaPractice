package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "KIM");
        member.print();
        member.changeData("SEO");
        member.print();
    }
}
