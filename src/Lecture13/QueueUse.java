package Lecture13;

import java.util.Scanner;

/**
 * QueueUse
 */
public class QueueUse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.print("Enter the size of the queue: ");
        int n = sc.nextInt();
        System.out.println("------------------------------------");
        Queue myQ = new Queue(n);
        System.out.print("Enter the choice: ");
        int ch = sc.nextInt();
        while(ch != -1){

            switch(ch){
                case 1:
                    System.out.print("Enter the element to be enqueued: ");
                    int x = sc.nextInt();
                    myQ.enqueue(x);
                    break;
                case 2:
                    x = myQ.dequeue();
                    if(x != -1){
                        System.out.println("The dequeued element is "+ x);
                    }
                    break;
                case 3:
                    x = myQ.front();
                    if(x != -1){
                        System.out.println("Element at the front is "+x);
                    }
                    break;
                case 4:
                    boolean empty = myQ.isEmpty();
                    if(empty){
                        System.out.println("The queue is empty");
                    }
                    else{
                        System.out.println("The queue is not empty");
                    }
                    break;
                case 5:
                    x = myQ.size();
                    System.out.println("The size of the queue is: "+x);
                    break;
                case 6:
                    myQ.print();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("------------------------------------");
            System.out.println();
            System.out.print("Enter the choice: ");
            ch = sc.nextInt();
        }
    }
}