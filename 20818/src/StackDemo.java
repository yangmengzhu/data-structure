import java.util.Arrays;

public class StackDemo<T> {
    public T[] elem;
    public int top;

    public StackDemo(int[] elem, int top) {
        this.elem = (T[])new Object[10];
        this.top = top;
    }
    public boolean full(){
        return this.top==this.elem.length;
    }
    public void push(T data){
        if(full()){
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[top++]=data;
    }
    public T pop(){
       if(empty()){
           throw new RuntimeException("栈为空");
       }
       T data=this.elem[top-1];
       this.top--;
       return data;
    }
    public T peek(){
        if(empty()){
            throw new RuntimeException("栈为空");
        }
        return this.elem[top-1];
    }
    public int size(){
       if(empty()){
           return 0;
       }
       return this.top;
    }
    public boolean empty(){
       return this.top==0;
    }
}
