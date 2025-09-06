package oop1.Ex;

public class Rectangle {
    int width;
    int height;


    //넓이 구하는 함수
    int calculateArea() {
        return width * height;
    }

    //둘레길이 구하는 함수
    int calculatePerimeter() {
        return 2 * (width + height);
    }

    //정사각형 여부
    boolean isSquare() {
        return width == height;
    }
}