import java.util.EmptyStackException;

public class Queue <T> {
    Node<T> front;
    Node<T> rear;

    public boolean isEmpty(){
        if (front==null){
            return true;
        }
        return false;
    }
    public void  enqueue (T value){
        Node<T> addedNode = new Node<T>(value);
        if (isEmpty()){
            front = addedNode;
        } else {
            rear.next = addedNode;
        }
        rear = addedNode;
    }

  public T dequeue(){
        if (!isEmpty()){
            Node t = front;
            front = front.next;
            t.next = null;
            return (T) t.value;
        }else{
            throw new EmptyStackException();
        }
  }
    public T  peek(){
        if (!isEmpty()){
            return front.value;
        }
    throw new EmptyStackException();
}
    @Override
    public String toString() {
        if (front == null) return "null";
        String list = " Front -->";
        Node<T> currentNode = front;
        while (currentNode != null){
            list =list+  " \"{ " + currentNode.value + " } -> \" ";
            currentNode = currentNode.next;
        }
        list += "Rear";
        return list;
    }

}
