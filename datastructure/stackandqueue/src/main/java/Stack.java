import java.util.EmptyStackException;


public class Stack <T> {
    Node<T> top;
    public void push(T value){
        Node<T> addedNode = new Node<T>(value);
        addedNode.next = top;
        top = addedNode;
    }
    public T pop(){
        if (!isEmpty()){
            Node<T> t = top;
            top=t.next;
            return t.value;
        }
        throw new EmptyStackException();

    }
    public T peek(){
        if(!isEmpty()) {
            return top.value;
        }
        throw new EmptyStackException();
}
    public boolean isEmpty(){
        if (top == null){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        if (top == null) return "null";
        String list = "Top --> ";
        Node<T> currentNode = top;
        while (currentNode != null){
            list =list+  " \"{ " + currentNode.value + " } --> \" ";
            currentNode = currentNode.next;
        }
        list += "Null";
        return list;
    }
}