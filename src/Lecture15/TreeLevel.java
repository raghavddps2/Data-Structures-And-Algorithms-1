package Lecture15;
import java.util.*;
/**
 * TreeLevel
 */
class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>> children;
 
    TreeNode(T data){
        this.data = data;
        children = new ArrayList<TreeNode<T>>(0);
    }
}

public class TreeLevel {

    public static void takeInputLevelWise(){

        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        QueueLL<TreeNode<T>> pendingNodes = new QueueLL<TreeNode<T>>();
        pendingNodes.enqueue(root);
        
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> firstNode = pendingNodes.dequeue();
            int n = s.nextInt(); //Asks the number of children.
            for(int i=0;i<n;i++){
                int childData = sc.nextInt();
                TreeNode<Integer> child = new TreeNode(childData);
                pendingNodes.enqueue(child);
                firstNode.children.add(child);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}