import java.util.*;
class Squares_Sort
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
        while(left<=right)
        {
            int ls=arr[left]*arr[left];
            int rs=arr[right]*arr[right];
        if(ls>rs)
        {
            ls=ls+rs;
            rs=ls-rs;
            ls=ls-rs;
            arr[left]=ls;
            arr[right]=rs;
            left++;
            right--;
        }
        if(ls<rs)
        {
            left++;
            right--;
        }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}