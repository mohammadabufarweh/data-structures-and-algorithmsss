import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree <T>  {
    Node root;
    public boolean isEmpty(){
         if (root == null)return false;
         return true;
    }
List <T> preOrderstoredArray=new ArrayList<>();
    public List<T> preOrder(Node <T> root) {
        if( root != null){
            preOrderstoredArray.add(root.value);
            if(root.left!=null){
                preOrder(root.left);
            }
            if (root.right!=null){
                preOrder(root.right);
            }
            return preOrderstoredArray;
        }
        return preOrderstoredArray;
    }
    List <T> inorderStoredArray=new ArrayList<>();
    public List <T> inOrder(Node <T> root){
        if( root != null){
        if (root.left!=null){
            inOrder(root.left);
        }
        inorderStoredArray.add(root.value);
        if (root.right!=null){
            inOrder(root.right);
        }}
        return inorderStoredArray;
    }
    List <T> postOrderstoredArray=new ArrayList<>();
    public List <T> postOrder(Node <T> root){
        if( root != null) {
            if (root.left != null) {
                postOrder(root.left);
            }
            if (root.right != null) {
                postOrder(root.right);
            }
            postOrderstoredArray.add(root.value);
        }
      return postOrderstoredArray;
    }

    public int treeMaxValue(Node root){
        if(root == null) {
            System.out.println("Tree is empty");
            return 0;
        }
        else{
            int leftMax;
            int rightMax;
            int max = (int) root.value;
            if(root.left != null){
                leftMax = treeMaxValue(root.left);
                if(max<leftMax){
                    max=leftMax;
                }
            }
            if(root.right != null){
                rightMax = treeMaxValue(root.right);
                if(max<rightMax){
                    max=rightMax;
                }
            }
            return max;
        }
    }


    public ArrayList<Integer> breadthFirst(Node root ){
        Queue<Node> breadthFistQueue = new LinkedList<Node>();
        ArrayList<Integer> breadthFirstStoredArray = new ArrayList<Integer>();
        if(root == null){
           return null;
        }else{
            breadthFistQueue.add(root);
            breadthFirstStoredArray.add((Integer)root.value);
            while(!breadthFistQueue.isEmpty()){
                Node saved = breadthFistQueue.remove();
                if(saved.left!=null){
                    breadthFistQueue.add(saved.left);
                    breadthFirstStoredArray.add((Integer)saved.left.value);
                }
                if(saved.right!=null){
                    breadthFistQueue.add(saved.right);
                    breadthFirstStoredArray.add((Integer)saved.right.value);
                }
            }
            return breadthFirstStoredArray;
        }
    }
    @Override
    public String toString() {
        return "BinaryTree{" +
                "preOrderstoredArray=" + preOrderstoredArray +
                ", inorderStoredArray=" + inorderStoredArray +
                ", postOrderstoredArray=" + postOrderstoredArray +
                '}';
    }
}
