/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test public void testAppHasAGreeting() {
        Library classUnderTest = new Library();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void testFindMinVal(){
        int[] test1 = {66, 64, 58, 65, 71, 57, 60}; //57
        int expected1 = 57;
        int actual1 = Library.findMinVal(test1);
        assertEquals("Should return smallest value",expected1,actual1);

        int[] test2 = {55, 54, 60, 53, 59, 57, 61}; //53
        int actual2 = Library.findMinVal(test2);
        int expected2 = 53;
        assertEquals("Should return smallest value",expected2,actual2);

        int[] test3 = {57, 65, 65, 70, 72, 65, 51}; //51
        int actual3 = Library.findMinVal(test3);
        int expected3 = 51;
        assertEquals("Should return smallest value",expected3,actual3);

        int[] test4 = {65, 56, 55, 52, 55, 62, 57}; //52
        int actual4 = Library.findMinVal(test4);
        int expected4 = 52;
        assertEquals("Should return smallest value",expected4,actual4);
    }
    @Test public void testFindMaxVal(){
        int[] test1 = {66, 64, 58, 65, 71, 57, 60}; //71
        int expected1 = 71;
        int actual1 = Library.findMaxVal(test1);
        assertEquals("Should return smallest value",expected1,actual1);

        int[] test2 = {55, 54, 60, 53, 59, 57, 61}; //61
        int actual2 = Library.findMaxVal(test2);
        int expected2 = 61;
        assertEquals("Should return smallest value",expected2,actual2);

        int[] test3 = {57, 65, 65, 70, 72, 65, 51}; //72
        int actual3 = Library.findMaxVal(test3);
        int expected3 = 72;
        assertEquals("Should return smallest value",expected3,actual3);

        int[] test4 = {65, 56, 55, 52, 55, 62, 57}; //65
        int actual4 = Library.findMaxVal(test4);
        int expected4 = 65;
        assertEquals("Should return smallest value",expected4,actual4);
    }

    @Test public void testHighLow(){
        int[][] arr = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String actual = Library.displayHighLow(arr);
        String expected = (
                "High: " + 72 + "\nLow: " + 51 + "\n"
                        + "Never saw temperature: " + 63 + "\n"
                        + "Never saw temperature: " + 67 + "\n"
                        + "Never saw temperature: " + 68 + "\n"
                        + "Never saw temperature: " + 69 + "\n"
        );

        assertEquals("Should return Highs,Lows, and missing values: ",expected,actual);
    }

    @Test public void testTally(){
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String expected = "Bush received the most votes";
        String actual =Library.tally(votes);

        assertEquals("Should return Bush received the most votes: ",expected,actual);
    }

    @Test public void testJSReader(){
        ArrayList<String> targets = new ArrayList<>();
        String line1 = "Line 15: Missing semicolon";
        String line2 = "Line 32: Missing semicolon";
        String line3 = "Line 51: Missing semicolon";
        targets.add(line1);
        targets.add(line2);
        targets.add(line3);
        String filePath = "src/test/resources/gates.js";
        boolean containsTargets = Library.readJSFile(filePath).containsAll(targets);
        assertTrue("Must contain all errors: ",containsTargets);
    }
}
