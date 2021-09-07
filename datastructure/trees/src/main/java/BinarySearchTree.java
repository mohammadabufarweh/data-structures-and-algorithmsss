import java.util.ArrayList;

public class BinarySearchTree  extends BinaryTree{
    Node <Integer> root;

public void  add(int value) {
    Node valueAsNode=new Node(value);
//        if (root.value == null) {
//            root = new Node(value);
//        }else{
        if (value < root.value) {
            if (root.left!=null) {
                root.value = (Integer) root.left.value;
                add(value);
            }else{
                root.left=valueAsNode;
        }
        } else if  (value > root.value) { ;
            if (root.right!=null) {
                root.value = (Integer) root.right.value;
                add(value);
            }else{
                root.right=valueAsNode;
            }
        }
        }

//        }

    boolean contain(Node<Integer> root, int value) {
        if (root == null) {
            return false;
        }
        if (value == root.value) {
            return true;
        }
         if (value < root.value){
            return  contain(root.left, value);
         }
        else {
             return contain(root.right, value);
         }

    }


}
//    public ArrayList<Object> fizzBuzz(BinaryTree data) {
//        ArrayList<Object> bfizzBuzzTreeArray = new ArrayList<Object>();
//        while (data.root!=null){
//            if ((int) data.root.value % 3 == 0) {
//                data.root.value = "Fizz";
//                bfizzBuzzTreeArray.add(data.root.value);
//            }
//            else if ((int) data.root.value % 5 == 0) {
//                data.root.value = "Buzz";
//                bfizzBuzzTreeArray.add(data.root.value);
//            }
//            else if ((int)data.root.value % 5 == 0 && (int)data.root.value % 3 == 0){
//                data.root.value = "FizzBuzz";
//                bfizzBuzzTreeArray.add(data.root.value);
//            }
//            else {
//                bfizzBuzzTreeArray.add(data.root.value);
//            }
//        }
//        return bfizzBuzzTreeArray;
//    }