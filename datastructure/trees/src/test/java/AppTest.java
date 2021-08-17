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
  @Test public void instantiateAnEmptyTree(){
        BinaryTree tree=new BinaryTree();
        tree.root=null;
     assertEquals("BinaryTree{preOrderstoredArray=[], inorderStoredArray=[], postOrderstoredArray=[]}",tree.toString());
  }
@Test public void singleRootNode(){
    BinaryTree tree=new BinaryTree();
    tree.root = new Node(10);
   tree.preOrder(tree.root);
   tree.inOrder(tree.root);
   tree.postOrder(tree.root);
    assertEquals("BinaryTree{preOrderstoredArray=[10], inorderStoredArray=[10], postOrderstoredArray=[10]}",tree.toString());
}
    @Test public void addLeftChild(){
        BinaryTree tree=new BinaryTree();
        tree.root = new Node(10);
        tree.preOrder(tree.root);
        tree.inOrder(tree.root);
        tree.postOrder(tree.root);
        BinarySearchTree treee=new BinarySearchTree();
        treee.root = new Node(10);
//        treee.add(treee.root, 40);
assertEquals("BinaryTree{preOrderstoredArray=[10, 40], inorderStoredArray=[10, 40], postOrderstoredArray=[10, 40]}",treee.toString());
    }
    @Test public void  preorderTraversalAndInorderTraversalAndPostorderTraversal(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(7);
        tree.preOrder(tree.root);
        tree.inOrder(tree.root);
        tree.postOrder(tree.root);
assertEquals("BinaryTree{preOrderstoredArray=[10, 5, 3, 7, 30], inorderStoredArray=[3, 5, 7, 10, 30], postOrderstoredArray=[3, 7, 5, 30, 10]}",tree.toString());
    }
    @Test public void CanAddLeftRightSingleRootNode(){
        BinarySearchTree treee = new BinarySearchTree();
        treee.root = new Node(10);
        treee.add( 40);
        treee.add(5);
        assertEquals("[5, 40, 10]",treee.postOrder(treee.root).toString());
    }
    @Test public void CanAddLeftSingleRootNode(){
        BinarySearchTree treee = new BinarySearchTree();
        treee.root = new Node(10);
//        treee.add( 40);
        treee.add(5);
        assertEquals("[5, 10]",treee.postOrder(treee.root).toString());
    }
    @Test public void CanAddRightSingleRootNode(){
        BinarySearchTree treee = new BinarySearchTree();
        treee.root = new Node(10);
        treee.add( 40);
//        treee.add(5);
        assertEquals("[40, 10]",treee.postOrder(treee.root).toString());
    }
}
