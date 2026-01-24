package Poly.overriding;

public class Child extends Parent{
    public String value = "Child";


    //ctrl + o
    @Override
    public void method() {
        System.out.println("child.Method");
    }
}
