package inheritance;

public class Shop extends Review{
    private String name;
    private String price;
    private String description;
    private Review reviews;

    public Shop(String name, String price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Shop(Review reviews) {
        this.reviews = reviews;
    }

    public void setReviews(Review reviews) {
        this.reviews = reviews;
    }

    public Shop(String body, String author, int stars, String name, String price, String description) {
        super(body, author, stars);
        this.name = name;
        this.price = price;
        this.description = description;

    }


    public Shop(String body, String author, int stars) {
        super(body, author, stars);
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getReviews() {
        return reviews.toString();
    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", reviews=" + reviews +
                '}';
    }


}