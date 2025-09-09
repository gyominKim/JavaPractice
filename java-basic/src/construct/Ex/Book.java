package construct.Ex;

public class Book {
    String title; //제목
    String author; //저자
    int page; //페이지 수

    //기본생성자
    Book() {
        this("", "", 0); //0 생략가능
    }

    //
    Book(String title, String author) {
        this(title, author,0);
    }

    //모든 필드를 받는
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목 : " + title + ", 저자 : " + author + ", 페이지 : " + page );
    }

}
