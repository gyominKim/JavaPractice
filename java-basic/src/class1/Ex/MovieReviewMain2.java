package class1.Ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        movieReviews[0] = inception;

        MovieReview AboutTime = new MovieReview();
        AboutTime.title = "어바웃 타임";
        AboutTime.review = "인생 시간 영화";
        movieReviews[1] = AboutTime;

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화제목 : " + movieReview.title + ", 리뷰 : " + movieReview.review);
        }

       /* for (int i = 0; i < movieReviews.length; i++) {
            System.out.println("영화제목 : " + movieReviews[i].title + ", 리뷰 : " + movieReviews[i].review);
        }*/
    }
}

