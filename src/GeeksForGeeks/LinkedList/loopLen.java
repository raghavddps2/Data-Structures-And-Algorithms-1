/**
 * Basically, what we do with this, is that we follow the turtle and the hare algorithm.
 * If at any point of time in the algorithm, the turtle becomes same as hare,
 * we say that a loop is there.
 * 
 * Now to identify the loop, all we have to is to to iterate the turtle till it becomes 
 * equal to hare and return the answer by incrementing by one. This way we will get the answer.
 */

int countNodesinLoop(Node head)
{
         Node turtle = head;
 Node hare = head;
 int ans = 0;
 while(hare != null && turtle != null && hare.next != null){
     hare = hare.next.next;
     turtle = turtle.next;
     
     if(hare == turtle){
         ans = 1;
         break;
     }
 }
 if(ans == 0){
     return 0;
 }
 else{
     int len = 0;
    turtle = turtle.next;
    while(hare != turtle){
        turtle = turtle.next;
        len++;
    }
    return (len+1);
 }
}