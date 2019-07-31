package Lecture13;

/**
 * reverseQueue
 */
public class reverseQueue {

    
	public static void reverseQueue1(Queue<Integer> q) {
		
        int arr[] = new int[q.size()];
        int i=0;
        while(!q.isEmpty()){
            arr[i] = q.dequeue();
            i++;
        }
        for(int k=arr.length-1;k>=0;k--){
            q.enqueue(arr[k]);
        }

    }
    
    public static void reverseQueue(Queue<Integer> q){

        if(q.size()<=1){
            return;
        }
        int front = q.dequeue();
        reverseQueue(q);
        q.enqueue(front);
        
    }
}