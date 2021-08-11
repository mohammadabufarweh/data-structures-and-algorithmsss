public class Pseudo <T> {
    public Stack<T> stack1 = new Stack<T>();
    public Stack<T> stack2 = new Stack<>();

    public void enqueue(T value){
    stack1.push(value);
    }

    public void dequeue(){

        while (stack1.top!=null){
          stack2.push(stack1.pop());

        }
        stack2.pop();
        while (stack2.top!=null){
            stack1.push(stack2.pop());

        }

    }
}
