package inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ShopTheaterTests {


        @Test
        public void shopTest(){
            Shop shop=new Shop("shop","$$","wings and rings");
            Review review1 = new Review("Neww Review Here","someOne",5);

            Assertions.assertEquals("shop",shop.getName());
            Assertions.assertEquals("$$",shop.getPrice());
            Assertions.assertEquals("wings and rings",shop.getDescription());


            Assertions.assertEquals("someOne",review1.getAuthor());
            Assertions.assertEquals("Neww Review Here",review1.getBody());
            Assertions.assertEquals(5,review1.getStars());


        }

        @Test
        public void shopReviewTest(){
            Shop shop=new Shop("BuffShop","$$","MyFav");
            Review review = new Review("body","NOoNe",5);
            shop.setReviews(review);

            Assertions.assertEquals("Shop{name='BuffShop', price='$$', description='MyFav', reviews=Review{body='body', author='NOoNe', stars=5}}", shop.toString());
        }
@Test
        public void addMovieTest(){
            Theater theater = new Theater("theater");

        theater.addMovie("Fadi");

            Assertions.assertEquals("[Fadi]",theater.getMovies());
        }

        @Test
        public void removeMovieTest(){
            Theater theater = new Theater("theater");

            theater.addMovie("Fadi");
            theater.addMovie("fly");
            theater.removeMovie("fly");

            Assertions.assertEquals("[Fadi]",theater.getMovies());
        }

        @Test
        public void addReviewTest(){
            Theater theater = new Theater("theater");
            Review review = new Review("newone","noOne",5);

            theater.setReviews(review);

            Assertions.assertEquals("newone",review.getBody());
            Assertions.assertEquals("noOne",review.getAuthor());
            Assertions.assertEquals(5,review.getStars());
        }
}
