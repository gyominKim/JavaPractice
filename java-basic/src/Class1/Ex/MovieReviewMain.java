package Class1.Ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview AboutTime = new MovieReview();
        AboutTime.title = "어바웃타임";
        AboutTime.review = "인생 시간 영화";

        System.out.println("영화제목 : " + inception.title + ", 리뷰:" + inception.review);
        System.out.println("영화제목 : " + AboutTime.title + ", 리뷰:" + AboutTime.review);
    }
}
