import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue(){
        stack1=new Stack<>();
        stack1=new Stack<>();
    }
    public boolean isEmpty(){
        return stack1.empty()&&stack2.empty();
    }
    public void offer(int data){
        stack1.push(data);
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        if(stack2.empty()){
            while(stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        if(stack2.empty()){
            while(stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
}
