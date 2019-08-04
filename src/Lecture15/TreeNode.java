package Lecture15;

/**
 * Trees101
 */
import java.util.*;

//Defining the tree node here. And from here we can construct tree
class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>> children;
    
    TreeNode(T data){
        this.data = data;
        children = new ArrayList<TreeNode<T>>(0);
    }
}
