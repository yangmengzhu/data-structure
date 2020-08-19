import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    public MyStack(){
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }
    public void push(int data){
        if(!queue1.isEmpty()){
            queue1.add(data);
        }else if(!queue2.isEmpty()){
            queue2.offer(data);
        }else{
            queue1.add(data);
        }
    }
  public boolean empty(){
     return queue1.isEmpty()&&queue2.isEmpty();
  }
  public int pop(){
        if(empty()){
            return -1;
        }
      int data=0;
        int size1=queue1.size();
      int size2=queue1.size();
        if(!queue1.isEmpty()){
            for (int i = 0; i < size1-1; i++) {
                queue2.offer(queue1.poll());
            }
            data=queue1.poll();
        }else{
            for (int i = 0; i < size2-1; i++) {
                queue1.offer(queue2.poll());
            }
            data=queue2.poll();
        }
        return data;
   }
   public int top(){
       if(empty()){
           return -1;
       }
       int data=0;
       int size1=queue1.size();
       int size2=queue1.size();
       if(!queue1.isEmpty()){
           for (int i = 0; i < size1; i++) {
               data=queue1.poll();
               queue2.offer(data);
           }
       }else{
           for (int i = 0; i < size2; i++) {
               data=queue2.poll();
               queue1.offer(data);
           }
       }
       return data;
   }
}
