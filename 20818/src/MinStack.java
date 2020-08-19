import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;
    public MinStack(){
        stack=new Stack<>();
        minstack=new Stack<>();
    }
    public void push(int data){
        stack.push(data);
        if(minstack.isEmpty()){
            minstack.push(data);
        }else{
            int top=minstack.peek();
            if(data<=top){
                minstack.push(data);
            }
        }
    }
    public void pop(){
        if(!stack.empty()){
            int tmp=stack.pop();
            if(minstack.peek()==tmp){
                minstack.pop();
            }
        }
    }
    public int getTop(){
        if(stack.empty()){
            return -1;
        }
        return stack.peek();
    }
    public int getMin(){
        if(minstack.empty()){
            return -1;
        }
        return minstack.peek();
    }
}
