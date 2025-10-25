import java.util.*;
class Increasing_Array
{
    public static boolean Sorted(int arr[],int pos,int size)
    {
        if(pos==size-1)
        return true;
            
        if(arr[pos]>arr[pos+1])
        return false;
            
        return Sorted(arr,pos+1,size);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the ellements:");
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();

        System.out.println(Sorted(arr,0,size));
    }
}