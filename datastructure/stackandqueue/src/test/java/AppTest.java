/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;
//import static org.junit.Assert.*;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

@Test public void pushStack(){
    Stack<Integer> sl = new Stack<>();
    sl.push(1);
    sl.push(2);
    sl.push(3);
    sl.push(4);
    assertEquals("Top -->  { 4 } -->  { 3 } -->  { 2 } -->  { 1 } --> Null",sl.toString());
}
    @Test public void pushOneToStack(){
        Stack<Integer> sl = new Stack<>();
        sl.push(1);
        assertEquals("Top -->  { 1 } --> Null",sl.toString());
    }
    @Test public void popStack(){
        Stack<Integer> sl = new Stack<>();
        sl.push(1);
        sl.push(2);
        sl.push(3);
        sl.push(4);
        sl.pop();
        assertEquals("Top -->  { 3 } -->  { 2 } -->  { 1 } --> Null",sl.toString());
    }
    @Test public void multiplePopStack(){
        Stack<Integer> sl = new Stack<>();
        sl.push(1);
        sl.push(2);
        sl.push(3);
        sl.push(4);
        sl.pop();
        sl.pop();
        sl.pop();
        sl.pop();
        assertEquals("null",sl.toString());
    }
    @Test public void peek(){
        Stack<Integer> sl = new Stack<>();
        sl.push(1);
        sl.push(2);
        sl.push(3);
        sl.push(4);
        sl.peek();
        assertEquals("4",sl.peek().toString());
    }
    @Test public void instantiateStack(){
        Stack<Integer> sl = new Stack<>();

        assertEquals("null",sl.toString());
    }
    @Test public void emptyStack(){
        Stack<Integer> sl = new Stack<>();
         sl.pop();
        assertEquals("null",sl.toString());
    }
    @Test public void enqueu(){
        Queue<Integer> ql = new Queue<>();
        ql.enqueue(1);
        ql.enqueue(2);
        ql.enqueue(3);
        ql.enqueue(4);
        assertEquals(" Front --> { 1 } ->   { 2 } ->   { 3 } ->   { 4 } ->  Rear",ql.toString());
    }
    @Test public void enqueuOneNode(){
        Queue<Integer> ql = new Queue<>();
        ql.enqueue(1);
        System.out.println(ql);
        assertEquals(" Front --> { 1 } ->  Rear",ql.toString());
    }
    @Test public void dequeueAfterEnqueu(){
        Queue<Integer> ql = new Queue<>();
        ql.enqueue(1);
        ql.enqueue(2);
        ql.enqueue(3);
        ql.enqueue(4);
        ql.dequeue();
        assertEquals(" Front --> { 2 } ->   { 3 } ->   { 4 } ->  Rear",ql.toString());
    }
    @Test public void peekvalue(){
        Queue<Integer> ql = new Queue<>();
        ql.enqueue(1);
        ql.enqueue(2);
        ql.enqueue(3);
        ql.enqueue(4);
        assertEquals("1",ql.peek().toString());
    }
    @Test public void emptyQueu(){
        Queue<Integer> ql = new Queue<>();
        ql.enqueue(1);
        ql.enqueue(2);
        ql.enqueue(3);
        ql.enqueue(4);
        ql.dequeue();
        ql.dequeue();
        ql.dequeue();
        ql.dequeue();
        assertEquals("null",ql.toString());
    }
    @Test public void empty(){
        Queue<Integer> ql = new Queue<>();

        assertEquals("null",ql.toString());
    }
    @Test public void peekWithEmptyQueue(){
        Queue<Integer> ql = new Queue<>();
         ql.peek();
        assertEquals("null",ql.toString());
    }
    @Test public void pseudoEnqueue(){
        Pseudo pseudo = new Pseudo();
        pseudo.enqueue(1);
        pseudo.enqueue(2);
        pseudo.enqueue(3);
        pseudo.enqueue(4);

        assertEquals("Top -->  { 4 } -->  { 3 } -->  { 2 } -->  { 1 } --> Null",pseudo.toString());
    }
    @Test public void pseudoDequeue(){
        Pseudo pseudo = new Pseudo();
        pseudo.enqueue(1);
        pseudo.enqueue(2);
        pseudo.enqueue(3);
        pseudo.enqueue(4);
        pseudo.dequeue();
        assertEquals("Top -->  { 4 } -->  { 3 } -->  { 2 } --> Null",pseudo.toString());
    }
    @Test public void pseudoEnqueueWasEmpty(){
        Pseudo pseudo = new Pseudo();
        assertEquals("null",pseudo.toString());
    }
    @Test public void pseudoDequeueWasEmptyStackHas(){
        Pseudo pseudo = new Pseudo();
        pseudo.dequeue();
        assertEquals("null",pseudo.toString());
    }
    @Test public void validateBrackets(){
        ValidateBrackets validateBrackets=new ValidateBrackets();
        String bracketssss = "{{}}()[()]{";
        assertEquals("false",ValidateBrackets.validateBrackets(bracketssss).toString());
    }
    @Test public void validateBracketsSibgleBracket(){
        ValidateBrackets validateBrackets=new ValidateBrackets();
        String bracketssss = "{";
        assertEquals("false",ValidateBrackets.validateBrackets(bracketssss).toString());
    }
    @Test public void validateBracketTruCase(){
        ValidateBrackets validateBrackets=new ValidateBrackets();
        String bracketssss = "{{}}()[()]";
        assertEquals("true",ValidateBrackets.validateBrackets(bracketssss).toString());
    }
    @Test public void validateBracketTruCaseWithWordsInBrackets(){
        ValidateBrackets validateBrackets=new ValidateBrackets();
        String bracketssss = "{{}}()[(khklj)]";
        assertEquals("true",ValidateBrackets.validateBrackets(bracketssss).toString());
    }
    @Test public void catsAndDogs(){
        Cat cat1 = new Cat("sheraz");
        Cat cat2 = new Cat("shahenaz");
        Cat cat3 = new Cat("zaza");
        Dog dog1 = new Dog("mosha3'eb");
        Dog dog2 = new Dog("molakem");
        Dog dog3 = new Dog("kalb");
        AnimalShelter as = new AnimalShelter();
        as.animals.toString();
        as.enqueue(cat1);
        as.enqueue(cat2);
        as.enqueue(cat3);
        as.enqueue(dog1);
        as.enqueue(dog2);
        as.enqueue(dog3);
        assertEquals(" Front --> { Cat: sheraz } ->   { Cat: shahenaz } ->   { Cat: zaza } ->   { Dog: mosha3'eb } ->   { Dog: molakem } ->   { Dog: kalb } ->  Rear",as.animals.toString());
    }
    @Test public void catsAndDogsDequeue(){
        Cat cat1 = new Cat("sheraz");
        Cat cat2 = new Cat("shahenaz");
        Cat cat3 = new Cat("zaza");
        Dog dog1 = new Dog("mosha3'eb");
        Dog dog2 = new Dog("molakem");
        Dog dog3 = new Dog("kalb");
        AnimalShelter as = new AnimalShelter();
        as.animals.toString();
        as.enqueue(cat1);
        as.enqueue(cat2);
        as.enqueue(cat3);
        as.enqueue(dog1);
        as.enqueue(dog2);
        as.enqueue(dog3);
        as.dequeue("cat");
        assertEquals(" Front --> { Cat: shahenaz } ->   { Cat: zaza } ->   { Dog: mosha3'eb } ->   { Dog: molakem } ->   { Dog: kalb } ->  Rear",as.animals.toString());
    }
}
