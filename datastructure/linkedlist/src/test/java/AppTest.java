/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;


public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test public void toStringTest(){
        Linkedliist ll =new Linkedliist();
        ll.add(5);
        ll.add(1);
        ll.add(2);
        ll.add(7);
        assertEquals("{ 5 } -> { 1 } -> { 2 } -> { 7 } -> NULL",ll.toString());
    }
    @Test public void insertTest(){
        Linkedliist ll =new Linkedliist();
        ll.add(5);
        ll.add(1);
        ll.add(2);
        ll.add(7);
        ll.insert(4);
//        ll.insert(6);
        assertEquals("{ 4 } -> { 5 } -> { 1 } -> { 2 } -> { 7 } -> NULL",ll.toString());
//        assertEquals("{ 6 } -> { 4 } -> { 5 } -> { 1 } -> { 2 } -> { 7 } -> NULL",ll.toString());
    }
    @Test public void includeTest(){
        Linkedliist ll =new Linkedliist();
        ll.add(5);
        ll.add(1);
        ll.add(2);
        ll.add(7);
        ll.includes(4);
        assertEquals(false,ll.includes(4));
        assertEquals(true,ll.includes(5));
    }
    @Test public void append(){
        Linkedliist ll =new Linkedliist();
        ll.append(5);
        ll.append(1);
        ll.append(2);
        ll.append(7);
        assertEquals("{ 5 } -> { 1 } -> { 2 } -> { 7 } -> NULL",ll.toString());

    }
    @Test public void inserBeforTest(){
        Linkedliist ll =new Linkedliist();
        ll.append(5);
        ll.append(1);
        ll.append(2);
        ll.append(7);
        ll.insertBefore(1,9);

        assertEquals("{ 5 } -> { 9 } -> { 1 } -> { 2 } -> { 7 } -> NULL",ll.toString());



    }
    @Test public void insertAfterTest(){
        Linkedliist ll =new Linkedliist();
        ll.append(5);
        ll.append(1);
        ll.append(2);
        ll.append(7);
        ll.insertAfter(1,9);
        assertEquals("{ 5 } -> { 1 } -> { 9 } -> { 2 } -> { 7 } -> NULL",ll.toString());
    }

    @Test public void kthValueTest() throws Exception {
        Linkedliist ll =new Linkedliist();
        ll.append(5);
        ll.append(1);
        ll.append(2);
        ll.append(7);
        ll.kthValue(3);
        assertEquals(2,ll.kthValue(1));
    }
    @Test public void linkedListZipTest()  {
        Linkedliist list =new Linkedliist();
        Linkedliist listone =new Linkedliist();
        listone.add(1);
        listone.add(3);
        listone.add(5);
        listone.add(7);
        Linkedliist listtwo =new Linkedliist();
        listtwo.add(2);
        listtwo.add(4);
        listtwo.add(6);
        listtwo.add(8);
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> { 6 } -> { 7 } -> { 8 } -> NULL",list.linkedListZip(listone,listtwo).toString());
    }
    @Test public void linkedListZipTestIfListOneLessThanTwo()  {
        Linkedliist list =new Linkedliist();
        Linkedliist listone =new Linkedliist();
        listone.add(1);
        listone.add(3);

        Linkedliist listtwo =new Linkedliist();
        listtwo.add(2);
        listtwo.add(4);
        listtwo.add(6);
        listtwo.add(8);
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 6 } -> { 8 } -> NULL",list.linkedListZip(listone,listtwo).toString());
    }
    @Test public void linkedListZipTestIfListTwoLessThanone()  {
        Linkedliist list =new Linkedliist();
        Linkedliist listone =new Linkedliist();
        listone.add(1);
        listone.add(3);
        listone.add(5);
        listone.add(7);
        Linkedliist listtwo =new Linkedliist();
        listtwo.add(2);
        listtwo.add(4);

        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> { 7 } -> NULL",list.linkedListZip(listone,listtwo).toString());
    }
    @Test public void reverseLinkedList()  {
        Linkedliist list =new Linkedliist();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(7);;
        assertEquals("{ 7 } -> { 2 } -> { 1 } -> { 5 } -> NULL",list.reverseLinkedList(list));

    }
}
