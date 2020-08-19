
class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class QueueDemo {
    public Node front;
    public Node tail;
    public int usedSize;
    public boolean offer(int data){
        Node node=new Node(data);
        if(this.front==null){
            this.front=node;
            this.tail=node;
        }else{
            this.tail.next=node;
            this.tail=node;
        }
        this.usedSize++;
       return true;
    }
    public boolean isEmpty(){
        return this.usedSize==0;
    }
    public int poll(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int data=this.front.data;
        this.front=this.front.next;
        return data;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int data=this.front.data;
        return data;
    }
    public int size(){
        return this.usedSize;
    }
}
