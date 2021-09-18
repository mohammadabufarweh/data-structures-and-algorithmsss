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
    int p=0;
    public int treeMaxValue(Node root){
        if(root == null) {
            System.out.println("Tree is empty");
            return 0;
        }
        else{
            System.out.println("counter   "+p++);
            int leftMax;
            int rightMax;
            int max = (int) root.value;
            System.out.println("max  "+max);
            if(root.left != null){
                leftMax = treeMaxValue(root.left);//10  53
                System.out.println("left  "+leftMax);
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

//    public void  addd(int value) {
//        Node valueAsNode=new Node(value);
////        if (root.value == null) {
////            root = new Node(value);
////        }else{
//        if (value <(int) root.value) {
//            if (root.left!=null) {
//                root.value = (Integer) root.left.value;
//                addd(value);
//            }else{
//                root.left=valueAsNode;
//            }
//        } else if  (value >(int) root.value) { ;
//            if (root.right!=null) {
//                root.value = (Integer) root.right.value;
//                addd(value);
//            }else{
//                root.right=valueAsNode;
//            }
//        }
//    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "preOrderstoredArray=" + preOrderstoredArray +
                ", inorderStoredArray=" + inorderStoredArray +
                ", postOrderstoredArray=" + postOrderstoredArray +
                '}';
    }
}
