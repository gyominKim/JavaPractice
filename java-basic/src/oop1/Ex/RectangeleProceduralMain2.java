package oop1.Ex;

public class RectangeleProceduralMain2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.height = 5;

        //넓이
        int area = rectangle.calculateArea();
        System.out.println("넓이 : " + area);
        //둘레길이
        int Perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이 : " + Perimeter);
        //정사각형 여부
        boolean isSquare = rectangle.isSquare();
        System.out.println("정사각형 여부 : " + isSquare);
    }
}
