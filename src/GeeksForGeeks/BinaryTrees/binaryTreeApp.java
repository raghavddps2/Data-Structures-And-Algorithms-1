package GeeksForGeeks.BinaryTrees;
/**
 *  We will learn about creating trees in (Binary trees) in java.
 */



class binaryTreeApp{
     
    class Node{
        int data;
        Node left;
        Node right;
    }

    public Node createNewNode(int k){
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }

    public void inorder(Node root){

        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public void preorder(Node root){

        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public int sumOfNodes(Node root){

        if(root == null){
            return 0;
        }
        return root.data+sumOfNodes(root.left)+sumOfNodes(root.right);
    }

    public void postorder(Node root){
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public int diffAtEvenAndOdd(Node root){
        if(root == null){
            return 0;
        }

        return root.data - diffAtEvenAndOdd(root.left) - diffAtEvenAndOdd(root.right);
    }

    public int numberOfNodes(Node root){

        if(root == null ){
            return 0;
        }
        else{
            return 1+numberOfNodes(root.left)+numberOfNodes(root.right);
        }
    }
    public int numberOfLeafNodes(Node root){

        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }
        
        return numberOfLeafNodes(root.left)+numberOfLeafNodes(root.right);
        
    }

    public int height(Node node){

        if(node == null){
            return 0;
        }
        int a = height(node.left);
        int b = height(node.right);

        return 1+Math.max(a,b);
    } 

    public static void main(String[] args) {
        
        //creating an instance of binary tree.
        binaryTreeApp a = new binaryTreeApp();

        // #We define the root this way
        Node root = a.createNewNode(2);
        root.left = a.createNewNode(7);
        root.right = a.createNewNode(5);

        root.left.left = a.createNewNode(2);
        root.left.right = a.createNewNode(6);
        root.left.right.left = a.createNewNode(5);
        root.left.right.right = a.createNewNode(11);

        root.right.right = a.createNewNode(9);
        root.right.right.left = a.createNewNode(4);

        System.out.println("Inorder");
        a.inorder(root);
        System.out.println();


        System.out.println("preorder");
        a.preorder(root);
        System.out.println();


        System.out.println("Inorder");
        a.postorder(root);
        System.out.println();

        System.out.println("Sum of nodes "+a.sumOfNodes(root));
        System.out.println();

        System.out.println("Diff of nodes at even and odd level: "+a.diffAtEvenAndOdd(root));
        System.out.println();

        System.out.println("Number of nodes in the binary tree are: "+a.numberOfNodes(root));
        System.out.println();

        a.numberOfLeafNodes(root);
        System.out.println("Number of leaf nodes: "+a.numberOfLeafNodes(root));
        System.out.println();

        System.out.println("Height of a binary tree is "+a.height(root));
    }
}