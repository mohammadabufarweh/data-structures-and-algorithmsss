public class NodeTree<T> {

    public  T value;
   public NodeTree right;
   public NodeTree left ;

    public NodeTree(T value) {
        this.value = value;
    }

    public NodeTree(T value, NodeTree right, NodeTree left) {
        this.value = value;
        this.right = right;
        this.left = left;
    }


    }

