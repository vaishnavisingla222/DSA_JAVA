import java.util.*;
package Array;
class Prefix_Sum/*prefix sum= sum of all the ellements till that number(including to that number)*/
{
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
        int sum=0;
        for(int i=0;i<size;i++)
        {
            arr[i]=sum+arr[i];
            sum=arr[i];
        }
        System.out.println("The modified array:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}