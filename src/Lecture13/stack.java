package Lecture13;

/**
 * stack
 */
public class stack {

    private int data[];
    private int top;

    stack(int size){
        data = new int[size];
        top = 0;
    }

    void push(int value){
        if(top == data.length){
            System.out.println("Stack Overflow!");
            return;
        }
        data[top] = value;
        top++;
    }

    int pop(){
        if(top == 0){
            System.out.println("Stack is empty!");
            return -1;
        }
            top--;
            int k = data[top];
            return k;
    }

    int top(){
        if(top == 0){
            System.out.println("Stack is empty!");
            return -1;
        }
        return data[top];
    }

    int size(){
        return top;
    }
    
    boolean isEmpty(){
        return (top == 0);
    }

    boolean isFull(){
        return (top == data.length);
    }
    void print(){
        if(top == 0){
            System.out.println("Stack is empty!");            
        }
        int p = top-1;
        while(p != -1){
            System.out.print(data[p]+" ");
            p--;
        }
        System.out.println();
    }

}