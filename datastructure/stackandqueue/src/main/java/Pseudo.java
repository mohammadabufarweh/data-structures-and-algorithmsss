public class Pseudo <T> {
    public Stack<T> stack1 = new Stack<T>();
    public Stack<T> stack2 = new Stack<>();

    public String enqueue(T value){
if(stack1.isEmpty()){
    return null;
}
    stack1.push(value);
        return null;
    }
    public Object dequeue(){
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return null;
        }
        while (stack1.top!=null){
          stack2.push(stack1.pop());
        }
        stack2.pop();
        while (stack2.top!=null){
            stack1.push(stack2.pop());
        }
       return stack1;
    }

    @Override
    public String toString() {
        return
                 stack1 +"";
    }
}
