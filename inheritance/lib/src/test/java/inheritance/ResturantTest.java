package inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ResturantTest {

    Restaurant restaurant = new Restaurant("resturent1", "5$");

    @Test
    public  void constructorTest(){
        Assertions.assertEquals("resturent1",restaurant.getName());

        Assertions.assertEquals("5$",restaurant.getPrice());
    }

    @Test
    public void toStringTest(){
        Assertions.assertEquals("Restaurant{name='resturent1', stars=0.0, price='5$', reviews=[]}",restaurant.toString());
    }


    @Test
    public void addReviewTest(){
        Restaurant restaurant = new Restaurant("Ahmad","20$");

        Review review1=new Review("big","Layana",3);

        restaurant.addReview(review1);



        Assertions.assertEquals("Layana",review1.getAuthor());
        Assertions.assertEquals("big",review1.getBody());
        Assertions.assertEquals(3,review1.getStars());

}
    public class ReviewTest {
        Restaurant restaurant = new Restaurant("resturent1", "5$");
        Review review = new Review("big", "Layana",3);

        @Test
        public  void constructorTest(){
            Assertions.assertEquals("big",review.getBody());
            Assertions.assertEquals(3,review.getStars());
            Assertions.assertEquals("Layana",review.getAuthor());
        }

        @Test
        public void toStringTest(){
            Assertions.assertEquals("Review{body='big', author='Layana', stars=3, restaurant=Restaurant{name='resturent1', stars=0.0, price='5$', reviews=[]}}",review.toString());


        }
        @Test
        public void shopTest(){
            Shop shop=new Shop("shop","$$","llll");
            Review review1 = new Review("layana","layana1",5);

            Assertions.assertEquals("shop",shop.getName());
            Assertions.assertEquals("$$",shop.getDollarSignNum());
            Assertions.assertEquals("llll",shop.getDescription());


            shop.addReview(review1);

            Assertions.assertEquals("layana1",review1.getAuthor());
            Assertions.assertEquals("layana",review1.getBody());
            Assertions.assertEquals(5,review1.getStars());


        }

        @Test
        public void shopReviewTest(){
            Shop shop=new Shop("shop","5","10$");
            Review review = new Review("body","Layana",2);
            shop.addReview(review);

            Assertions.assertEquals("Shop{name='shop', dollarSignNum=5, description='10$', reviews=[Review{body='body', author='Layana', stars=2}]}", shop.toString());
        }
        public void addMovieTest(){
            Theater theater = new Theater("theater");

//        theater.addMovie("Fadi");
            theater.addMovie("Layana");

            Assertions.assertEquals("[Layana]",theater.getMovies());
        }

        @Test
        public void removeMovieTest(){
            Theater theater = new Theater("theater");

            theater.addMovie("Fadi");
            theater.removeMovie("Layana");

            Assertions.assertEquals("[Fadi]",theater.getMovies());
        }

        @Test
        public void addReviewTest(){
            Theater theater = new Theater("theater");
            Review review = new Review("jjjj","kkkk",5);

            theater.addReview(review);

            Assertions.assertEquals("jjjj",review.getBody());
            Assertions.assertEquals("kkkk",review.getAuthor());
            Assertions.assertEquals(5,review.getStars());
        }
}
