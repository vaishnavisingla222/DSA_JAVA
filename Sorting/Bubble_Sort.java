import java.util.*;
class Bubble_Sort {
    public static void sort(int[]arr)
    {
        int len=arr.length;
        for(int i=0;i<len-1;i++)
        //till len can also be done but  its unnecessary because till len-1 last ellement will also get sorted
        {
            boolean check=false;
           /*checks weather the array is sorted or not by checking any swap done or not so that unnecssary itteration are not done & program gets optimzed*/
          for(int j=0;j<len-1-i;j++)
          // till len-1 can also be done but its again unnecessary since last i will itself get sorted
          {
            if(arr[j]>arr[j+1])
            {
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                check=true;//swap happened
            }
          }
          if(check==false)//if swap not happened array is sorted no need to do more iterations
          return;
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int len=sc.nextInt();

        int arr[]=new int[len];
        System.out.println("Enter the ellemnts of the array");
        for(int i=0;i<len;i++)
        arr[i]=sc.nextInt();

        sort(arr);
        System.out.println("The sorted array is:");
        for (int i = 0; i < len; i++)
        System.out.print(arr[i] + " ");

        System.out.println();
    }
}
