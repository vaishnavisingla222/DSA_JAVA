import java.util.Scanner;

public class LinkedList_Implimentation 
{
    static Scanner sc=new Scanner(System.in);
    public static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static void preorder(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static Node createTree()
    {
        int val=sc.nextInt();
        if(val==-1)
            return null;
        Node root=new Node(val);
        System.out.print("Enter the left node of "+val+": ");
        root.left=createTree();
        System.out.print("Enter the right node of "+val+": ");
        root.right=createTree();
        return root;
    }
    public static void main(String args[])
    {
        System.out.print("Enter the number of nodes: ");
        int size=sc.nextInt();
        System.out.print("Enter the root node: ");
        Node root=createTree();

        System.out.print("Preorder: ");
        preorder(root);
        System.out.print("\nInorder: ");
        inorder(root);
        System.out.print("\nPostorder: ");
        postorder(root);
    }
}
