import java.util.*;
public class Reverse {
    public static void reverse_part(int arr[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the starting index");
        int a=sc.nextInt();
        System.out.println("Enter the ending index");
        int b=sc.nextInt();
        for(int i=a,j=b;i<j;i++,j--)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return;
    }
    public static void reverse_complete(int arr[])
    {
        int size=arr.length;
         for(int i=0,j=size-1;i<j;i++,j--)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return;
    }
    public static void main(String argd[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the ellements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
       //reverse_complete(arr);
       reverse_part(arr);
        System.out.println("The reverse array=");
        for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");
    }
}
