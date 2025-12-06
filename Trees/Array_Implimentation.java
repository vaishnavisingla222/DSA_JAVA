import java.util.Scanner;

public class Array_Implimentation 
{
    static int size=0;
    static int arr[]=new int[1000];
    static int maxind=-1;
    public static boolean isFull()
    {
        return (size==1000);
    }
    public static boolean isEmpty()
    {
        return size==0;
    }
    public static void insert(int val,int pos)
    {
        if(isFull())
        {
            System.out.println("Tree is full no more insertion\n");
            return;
        }
        arr[pos]=val;
        if(maxind<pos)
            maxind=pos;
        return;
    }
    public static void preorder(int arr[],int pos)
    {
        if(isEmpty() || pos>size)
            return;
        System.out.print(arr[pos]+" ");
        preorder(arr, 2*pos+1);
        preorder(arr, 2*pos+2);
    }
    public static void inorder(int arr[],int pos)
    {
        if(isEmpty() || pos>size)
            return;
        inorder(arr, 2*pos+1);
        System.out.print(arr[pos]+" ");
        inorder(arr, 2*pos+2);
    }
    public static void postorder(int arr[],int pos)
    {
        if(isEmpty() || pos>size)
            return;
        postorder(arr, 2*pos+1);
        postorder(arr, 2*pos+2);
        System.out.print(arr[pos]+" ");
    }
    public static void main(String args[])
    {
        for(int i=0;i<1000;i++)
            arr[i]=-1;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        size=sc.nextInt();
        System.out.print("Enter the nodes value level wise(-1 for no node): ");
        int i=0;
        while(i<size)
        {
            int val=sc.nextInt();
            if(val!=-1)
                insert(val,i);
            i++;
        }
        System.out.print("Preorder: ");
        preorder(arr,0);
        System.out.print("\nInorder: ");
        inorder(arr,0);
        System.out.print("\nPostorder: ");
        postorder(arr,0);
    }
}
