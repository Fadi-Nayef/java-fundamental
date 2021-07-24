package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int stars;
    private String price;
    public ArrayList<Review> review = new ArrayList<>();

    public Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public Restaurant(String name, int stars) {
        this.name = name;
        this.stars = stars;


    }

    public void addReview(Review review) {
        this.review.add(review);

    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {

        this.name = newName;
    }

    public int getStars() {

        return stars;
    }

    public void setStars(int stars) {

        this.stars = stars;
    }

    public String getPrice() {

        return price;
    }

    public void setPrice(String price) {

        this.price = price;
    }

    public ArrayList<Review> getReview() {
        return review;
    }

    public void setReview(ArrayList<Review> review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price='" + price + '\'' +
                '}';
    }


}
