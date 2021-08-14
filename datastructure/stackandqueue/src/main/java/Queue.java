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
      if (isEmpty()) try {
          throw new Exception(" Queue is Empty ");
      } catch (Exception e) {
          e.printStackTrace();
          return null;
      }
      Node t = front;
        if (!isEmpty()){
            front = front.next;
            t.next = null;
            return (T) t.value;
        }
      return (T) t.value;
  }
    public T  peek(){
        if (isEmpty()) try {
            throw new Exception(" Queue is Empty ");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        if (!isEmpty()){
            return front.value;
        }
        return front.value;

    }
    @Override
    public String toString() {
        if (front == null) {
            return "null";
        }else {
            String list = " Front -->";
            Node<T> currentNode = front;
            while (currentNode != null) {
                list = list + " { " + currentNode.value + " } ->  ";
                currentNode = currentNode.next;
            }
            list += "Rear";
            return list;
        }
    }

}
