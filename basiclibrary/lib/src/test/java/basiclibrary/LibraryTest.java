/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import static basiclibrary.RollDice.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    @Test public void RollDiceTest() {
        Library libraryForTesting = new Library();

        int input = 4;
        int[] expeected = new int[input];
        int expectedlng=expeected.length;


        assertEquals("Length of Array should be 5", expectedlng,RollDice.roll(4));
        assertEquals("Length of Array should be 56", testMEAgain.size(), 56);

    }
