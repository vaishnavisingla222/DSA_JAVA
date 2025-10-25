import java.util.*;
class Sort_Even_Odd
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
        int left=0,right=size-1;
        while(left<right)
        {
        if(arr[left]%2!=0 && arr[right]%2==0)
        {
            int l=arr[left];
            int r=arr[right];
            l=l+r;
            r=l-r;
            l=l-r;
            arr[left]=l;
            arr[right]=r;
            left++;
            right--;
        }
        if(arr[left]%2==0)
        {
            left++;
        }
        if(arr[right]%2!=0)
        {
            right--;
        }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}