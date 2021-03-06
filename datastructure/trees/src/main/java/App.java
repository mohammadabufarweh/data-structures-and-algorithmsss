import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(7);
        System.out.println("----------preOrder--------");
        System.out.println(tree.preOrder(tree.root));
        System.out.println(tree.inOrder(tree.root));
        System.out.println(tree.postOrder(tree.root));
        System.out.println(tree.toString());


        BinarySearchTree treee = new BinarySearchTree();
        treee.root = new Node(10);
        treee.add(1);
        treee.add(40);
//        treee.add(5);

//          treee.add(600);
        System.out.println(treee.postOrder(treee.root));
//        System.out.println(treee.toString());



        //        System.out.println(treee.contain(treee.root, 10));

        BinaryTree treeMaximum = new BinaryTree();
        treeMaximum.root = new Node(10);
        treeMaximum.root.left = new Node(53);
        treeMaximum.root.right = new Node(3330);
        treeMaximum.root.left.left = new Node(3);
        treeMaximum.root.left.right = new Node(7);


        System.out.println("----------treeMaxValue--------");
        System.out.println(treeMaximum.treeMaxValue(treeMaximum.root));
//
        System.out.println("----------breadthFirst--------");
//        System.out.println(treeMaximum.breadthFirst(treeMaximum.root));

        System.out.println("----------FizzBuzz--------");

        BinaryTree trees = new BinaryTree();
        trees.root = new Node(5);
        trees.root.left = new Node(5);
        trees.root.right = new Node(5);
        trees.root.left.left = new Node(5);
        trees.root.left.right = new Node(5);

        FizzBuzzTree fizzBuzzTree = new FizzBuzzTree();
        System.out.println(trees.preOrder(trees.root));
//      fizzBuzzTree.fizzBuzz((BinaryTree<Object>) trees.preOrder( trees.root));
//        fizzBuzzTree.fizzBuzz(trees.preOrder(trees.root));
    }

}
