package Poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //x001
        //단 자식의 기능은 호출할 수 없다, 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅(부모타입 -> 자식타입)
        Child child = (Child)poly; // x001
        //(타입)처럼 괄호와 그 사이에 타입을 저장하면 참조대상을 특정 타입으로 변경가능 특정 타입을 변경하는 것 캐스팅
        child.childMethod();

    }
}
