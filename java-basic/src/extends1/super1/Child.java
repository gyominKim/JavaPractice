package extends1.super1;

public class Child extends Parent{
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this.value = " + this.value); //this는 나한테서 찾는거
        System.out.println("super value = " + super.value); //super은 부모한테찾는거

        this.hello(); // this 생략 가능
        super.hello();
    }
}
