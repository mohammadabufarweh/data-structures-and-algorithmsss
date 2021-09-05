public class Node {

    int key;
    Object value;
    Node next;

    public Node(int key,Object value){
        this.key=key;
        this.value=value;
        next=null;

    }
    public Node(){
        next= null;

    }
    public int getKey(){
        return key;
    }
    public Object getValue(){
        return value;
    }
}
