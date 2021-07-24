package inheritance;

import java.util.ArrayList;

public class Theater extends Review {

    private ArrayList<String> movies = new ArrayList<String>();
    private Review reviews = new Review();

    private String name;

    public Theater(String name) {
        super();
        this.name = name;
    }

    public String getMovies() {
        return movies.toString();
    }

    public String getName() {
        return name;
    }

    public void addMovie(String movieName) {
        this.movies.add(movieName);
    }

    public void removeMovie(String movieName) {
        this.movies.remove(movieName);
    }


    public Theater(Review reviews) {
        this.reviews = reviews;
    }

    public void setReviews(Review reviews) {
        this.reviews = reviews;
    }


    @Override
    public String toString() {
        return "Theater{" +
                "movies=" + movies +
                ", reviews=" + reviews +
                ", name='" + name + '\'' +
                '}';
    }

}