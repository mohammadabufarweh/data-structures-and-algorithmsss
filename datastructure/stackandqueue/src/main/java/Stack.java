public class Stack <T>  {

    Node<T> top;

    public void push(T value){

        Node<T> addedNode = new Node<T>(value);
        addedNode.next = top;
        top = addedNode;

    }
    Node<Character> topChar;
    public Character pushChacr(char value){
        Node<Character> addedNode = new Node<Character>(value);
        addedNode.next = topChar;
        topChar = addedNode;
        return addedNode.value;
    }

    public T pop() {
        if (isEmpty()) try {
            throw new Exception(" Stack is Empty ");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        Node<T> t = top;
        if (!isEmpty()) {

            top = t.next;
            return t.value;
        }
        return t.value;
    }

    public Character popChar(){
        Node<Character> tt = topChar;
            topChar=tt.next;
        return tt.value;

    }

    public T peek(){
        if (isEmpty()) try {
            throw new Exception(" Stack is Empty ");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        if(!isEmpty()) {
            return top.value;
        }
        return top.value;
}
    public boolean isEmpty(){
        if (top == null){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        if (top == null){
            return "null";
        }else{
            String list = "Top --> ";
            Node<T> currentNode = top;
            while (currentNode != null){
                list =list+  " { " + currentNode.value + " } --> ";
                currentNode = currentNode.next;
            } list += "Null";
            return list;
        }


    }
}