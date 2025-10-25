import java.util.Scanner;
/*
 * eg 1 2 3 4 5
 * rotate 3 times
 * 1st time- 5 1 2 3 4
 * 2nd- 4 5 1 2 3
 * 3rd- 3 4 5 1 2
 * ultimately
 * 1st- reverse the array
 * 2nd- reverse from index 0 till the insex k-1
 * 3rd-  reverse from index k to size-
 */
public class Rotate // rotate the array by k steps
{
    public static void rotate(int[] arr, int r)
    {
        int size=arr.length;
        for(int i=0,j=size-1;i<j;i++,j--)//reverse the array completely
        {
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
        for(int i=0,j=r-1;i<j;i++,j--)// reverse from index 0 till the insex k-1
        {
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
        for(int i=r,j=size-1;i<j;i++,j--)// reverse from index k to size-1
        {
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the ellements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("How many times you have to rotate the array");
        int k=sc.nextInt();
        k=k%size;
        rotate(arr,k);
        System.out.println("The rotate array=");
        for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");
    }
}
