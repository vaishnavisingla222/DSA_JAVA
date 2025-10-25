import java.util.*;
class Sort_0_1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the ellements remeber to put only 0 and 1");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int left=0,right=size-1;
        while(left<right)
        {
        if(arr[left]==1 && arr[right]==0)
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
        if(arr[left]==0)
        {
            left++;
        }
        if(arr[right]==1)
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