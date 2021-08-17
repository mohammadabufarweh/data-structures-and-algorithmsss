public class Node<T> {

    public  T value;
   public Node right;
   public Node left ;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node right, Node left) {
        this.value = value;
        this.right = right;
        this.left = left;
    }


    }

