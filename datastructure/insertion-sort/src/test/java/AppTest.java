/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void insertionSort(){
        InsertionSort insertionSort=new InsertionSort();
        int [] arr = {8,4,23,42,16,15};
        assertEquals("[4, 8, 15, 16, 23, 42]",Arrays.toString(insertionSort.insertionSort(arr)));
    }

    @Test public void reverseSort(){
        InsertionSort insertionSort=new InsertionSort();
        int [] arr = {20,18,12,8,5,-2};
        assertEquals("[-2, 5, 8, 12, 18, 20]",Arrays.toString(insertionSort.insertionSort(arr)));
    }

    @Test public void  fewUniques(){
        InsertionSort insertionSort=new InsertionSort();
        int [] arr = {5,12,7,5,5,7};
        assertEquals("[5, 5, 5, 7, 7, 12]",Arrays.toString(insertionSort.insertionSort(arr)));
    }
    @Test public void  nearlySorted(){
        InsertionSort insertionSort=new InsertionSort();
        int [] arr = {2,3,5,7,13,11};
        assertEquals("[2, 3, 5, 7, 11, 13]",Arrays.toString(insertionSort.insertionSort(arr)));
    }
}
