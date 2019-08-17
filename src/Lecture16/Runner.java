package Lecture16;
import java.util.Scanner;

import Lecture8.print;


class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}
class BinarySearchTree {
	// Complete this class
    BinaryTreeNode<Integer> root = null;
    
    
    public BinaryTreeNode<Integer> insert_dev(BinaryTreeNode<Integer> root,int data){
        if(root == null){
            BinaryTreeNode<Integer> new_node = new BinaryTreeNode<Integer>(data);
            root = new_node;
            return root;
        }
       if(data<root.data){
           root.left = insert_dev(root.left,data);
       }
         else{
            root.right =  insert_dev(root.right,data);
        }
        return root;
    }
    
    public void insertData(int data){
        BinaryTreeNode<Integer> res = insert_dev(root,data);
    }
    public void printTree1(BinaryTreeNode<Integer> root){
        System.out.println();
        if(root == null){
            return;
        }
        printTree1(root.left);
        System.out.print(root.data+" hi");
        printTree1(root.right);
    } 
    public void printTree(){
        printTree1(root);
    }
	
}

public class Runner {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int choice, input;
		while(true) {
			choice = s.nextInt();
			switch(choice) {
				case 1 : 
					input = s.nextInt();
                    bst.insertData(input);
                    System.out.println(bst.root.data+"hi");
					break;
				case 2 : 
					input = s.nextInt();
					// bst.deleteData(input);
					break;
				case 3 : 
					input = s.nextInt();
					// System.out.println(bst.search(input));
					break;
				case 4:
					bst.printTree();
					return;
			}

		}
	}
}
