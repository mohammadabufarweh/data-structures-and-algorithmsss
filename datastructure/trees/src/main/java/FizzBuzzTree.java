import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FizzBuzzTree extends BinaryTree {
    public void fizzBuzz(BinaryTree data) {
        ArrayList<Object> bfizzBuzzTreeArray = new ArrayList<Object>();
       data= (BinaryTree) preOrder(root);
        while (data.root.value!=null){
            if ((int) data.root.value % 3 == 0) {
                bfizzBuzzTreeArray.add("Fizz");
            }
           else if ((int) data.root.value % 5 == 0) {
                bfizzBuzzTreeArray.add("Buzz");
            }
           else if ((int)data.root.value % 5 == 0 && (int)root.value % 3 == 0){
                bfizzBuzzTreeArray.add("FizzBuzz");
        }
           else {
                bfizzBuzzTreeArray.add(data.root.value);
            }
        }
        System.out.println(bfizzBuzzTreeArray);
    }

}
