package Lecture15;
import java.util.*;
/**
 * TreeImplementation
 */
class QueueEmptyException{
    
}
public class TreeImplementation {

    static Scanner sc = new Scanner(System.in);
    
    
    public static TreeNode<Integer> takeInput(){
        
        // System.out.println("Enter the value of the root element");
        Integer x = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(x);

        // System.out.print("Enter the number of children:\t");
        int children = sc.nextInt();
        
        for(int i=0;i<children;i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);            
        }

        return root;
    }

	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Print output as specified in the question
		 */
        QueueUsingLL<TreeNode<Integer>> myQ  = new QueueUsingLL<TreeNode<Integer>>();
		myQ.enqueue(root);
        
        while(!myQ.isEmpty()){
            try{
                TreeNode<Integer> firstNode = myQ.dequeue(); 
                System.out.print(firstNode.data+":");
                int n = firstNode.children.size();
                for(int i=0;i<n;i++){
                    TreeNode<Integer> temp = firstNode.children.get(i);
                    if(i != (n-1)){
                        System.out.print(temp.data+",");
                    }
                    else{
                        System.out.print(temp.data);
                    }
                    myQ.enqueue(temp);
                }
                System.out.println();
            }
            catch(QueueEmptyException e){
                
            }
            
        }
        
	}


    public static void printTree(TreeNode<Integer> root){
      
        //This is the tree representation.
        int n = root.children.size();
        System.out.print(root.data+":");
        for(int i=0;i<n;i++){
            TreeNode<Integer> child = root.children.get(i);
            if(i == (n-1)){
                System.out.print(child.data);
            }
            else{
                System.out.print(child.data+",");
            }
        }
        System.out.println();
        //Repeating for nodes
        for(int i=0;i<n;i++){
            TreeNode<Integer> child = root.children.get(i);
            printTree(child);
        }
    }
    public static void main(String[] args) {
            
        TreeNode<Integer> root = takeInput();
        printTree(root);
    }
}