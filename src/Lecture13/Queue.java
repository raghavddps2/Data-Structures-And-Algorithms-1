package Lecture13;

/**
 * Queue
 * The modulus code for enqueue and dequeue functions are super simple.
 * we just go to nestIndex+1%data.length  in enqueue
 * we just go to frontIndex+1%data.length in dequeue
 * And this just helps us to keep track of ALL edge case scenarioes too.
 * 
 * DO IMPLEMENT THIS APPROACH!
 */
public class Queue {

    int queue[];
    int frontIndex = -1;
    int nextIndex = -1;
    Queue(int n){
        queue = new int[n];
    }

    public void enqueue(int n){
        if(frontIndex == 0 && nextIndex == queue.length ){
            System.out.println("The queue is full");
            return;
        }
        else if(frontIndex == -1){
            frontIndex++;
            queue[frontIndex] = n;
            nextIndex = frontIndex+1;
        }
        else if(frontIndex != 0 && nextIndex == queue.length){
            nextIndex = 0;
            queue[nextIndex] = n;
            nextIndex++;
        }
        else{

            queue[nextIndex] =n;
            nextIndex++;
        }
        System.out.println("Enqueued successfully");

        /*
            *Mam's super simple code
            if(length == data.length){
                //full
                //return
            }
            data[nextIndex] = val ; here nextIndex = 0
            if(front == -1){
                //first element
                frontIndex =0
            }
            nextIndex = (nextIndex+1)%data.length;

        */
        
    }

    public void print(){
        if(frontIndex == -1){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("The elements of the queue are: ");
        if(frontIndex < nextIndex){
            for(int i=frontIndex;i<nextIndex;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
        else{
            for(int i=frontIndex;i<queue.length;i++){
                System.out.print(queue[i]+" ");                
            }
            for(int i=0;i<nextIndex;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }

    public boolean isEmpty(){
        if(frontIndex == -1){
            return true;
        }
        return false;
    }

    public int dequeue(){
        int k=0;
        if(frontIndex == -1){
            System.out.println("The queue is empty");
            return -1;            
        }
        if((frontIndex+1) == nextIndex){
            k = queue[frontIndex];
            frontIndex = -1;
            nextIndex = -1;
        }
        else if(frontIndex == queue.length-1){
            k = queue[frontIndex];
            frontIndex = 0;
        }
        else{
            k = queue[frontIndex];
            frontIndex++;
            
        }
        System.out.println("Dequeued successfully");
        return k;

        /*
            Mam's super simple logic
            int k = data[frontIndex];
            firstIndex = (firstIndex+1)%data.length;
        */
        }
    public int front(){
        if(frontIndex == -1){
            System.out.println("The queue is empty");
            return -1;
        }
        else{
            return queue[frontIndex];
        }
    }

    public int size(){
        if(frontIndex == -1){
            return 0;
        }
        if(frontIndex<nextIndex){
            return (nextIndex-frontIndex);
        }
        else{
            return (queue.length-frontIndex+nextIndex);
        }
    }

}