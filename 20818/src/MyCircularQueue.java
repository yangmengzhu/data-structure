public class MyCircularQueue {
    public int[] elem;
    public int front;
    public int rear;

    public MyCircularQueue(int k) {
        this.elem = new int[k+1];
    }
    public boolean isFull(){
        return (this.rear+1)%this.elem.length==this.front;
    }
    public boolean isEmpty(){
        return this.rear==this.front;
    }
    public boolean enQueue(int data){
        if(isFull()){
            return false;
        }
        this.elem[rear]=data;
        this.rear=(this.rear+1)%this.elem.length;
        return true;
    }
    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        this.front=(this.front+1)%this.elem.length;
        return true;
    }
    public int front(){
        if(isEmpty()){
            return -1;
        }
        return this.elem[this.front];
    }
    public int rear(){
        if(isEmpty()){
            return -1;
        }
        int index=this.rear==0?this.elem.length-1:this.rear-1;
        return this.elem[index];
    }
}
