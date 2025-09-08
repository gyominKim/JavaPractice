package Construct;

public class MemberInit {
    String name;
    int age;
    int grade;


    //추가
    void initMember(MemberInit member, String name, int age, int grade) {
        this.name = name; //이름이 동일할때 name이 저 위에 String name말하는건지 void안에 있는 name말하는건지 모른다 가까운데가 우선순위가 되어서 void가 자동으로 된다 그래서 this해서 String으로 되는거
        this.age = age;
        this.grade = grade;

    }
}
