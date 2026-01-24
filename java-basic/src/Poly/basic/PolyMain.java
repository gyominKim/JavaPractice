package Poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자신 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();
        child.parentMethod();


        //부모변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //parent엔 child 정보가 아예 없음 이거 부르고 싶으면 캐스팅 필요

        //Child child1 = new Parent(); 자식은 부모를 담을 수 없다 부모는 자식을 담을 수 있다


        // 자식 기능은 호출 불가능 컴파일 오류 발새
        //poly.childMethod() poly는 parent타입이라 본인만 알고 있음 그래서 자식 메소드 호출 불가능
    }
}
