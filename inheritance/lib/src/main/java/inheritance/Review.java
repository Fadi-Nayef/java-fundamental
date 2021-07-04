package inheritance;

//public class Review extends Resturant{
//private String body ;
//private String author ;
//
//
//    public Review(String name, Integer stars, String price, String body , String author) {
//        super(name, stars, price);
//    this.author=author;
//    this.body=body;
//
//    }
//
//    @Override
//    public void setStars(Integer stars) {
//        super.setStars(super.getStars());
//    }
//
//    @Override
//    public String toString() {
//        return "Review{" +
//                "body='" + body + '\'' +
//                ", author='" + author + '\'' +
//                '}';
//    }
//}
import java.util.ArrayList;

public class Review {
    //public ArrayList<Review> feedback;

    // public Restaurant restaurantImAbout;

    private String body;
    private String author;
    public int stars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        //this.feedback = new ArrayList<Review>();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                '}';
    }
}