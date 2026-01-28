package Poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();

        //배열안에  변수선언하는 방법 ctrl + alt + n
       Animal[] animalArr = {dog, cat, cow, duck};


       //변하지 않는 부분
        for (Animal animal : animalArr) {
            //method 추출하는 단축키 ctrl + alt + m
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }



    }
}
