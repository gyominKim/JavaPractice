package oop1.Ex;

public class RectangleProceduralMain2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
       /* rectangle.width = 5;
        rectangle.height = 8;*/

        int area = rectangle.calculateArea(5, 8);
        System.out.println("둘레 : " + area);

        int perimeter = rectangle.calculatePerimeter(5,8);
        System.out.println("넓이 : " + perimeter);

        boolean isSquare = rectangle.isSquare(5, 8);
        System.out.println("정사각형 여부 : " + isSquare);

    }
}
