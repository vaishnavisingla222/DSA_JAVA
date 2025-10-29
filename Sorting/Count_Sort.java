import java.util.*;
class Count_Sort
{
    public static void count_sort(int arr[])//by using prefix sum array stability is made sure to exist
    { 
        int len=arr.length;
        int[] out=new int[len];
        //find the largest ellement in the array
        int max=arr[0];
        for(int i=0;i<len;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        //make an array to store the freq of numbers from 0 to max
        int[] freq=new int[max+1];
        //count the freq of each number
        for(int i=0;i<len;i++)
        freq[arr[i]]++;

        //find prefix array of freq arr
        for(int i=1;i<max+1;i++)
        freq[i]+=freq[i-1];

        //find index of each ellent
        for(int i=len-1;i>=0;i--)
        {
            int indx=freq[arr[i]]-1;
            out[indx]=arr[i];
            freq[arr[i]]--;
        }

        //copy of all ellement to original array;
        for(int i=0;i<len;i++)
        arr[i]=out[i];
    }
    public static void sort(int arr[])// this method has a problem with stability of the code 
    {
        int len=arr.length;
        //find the largest ellement in the array
        int max=arr[0];
        for(int i=0;i<len;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        //make an array to store the freq of numbers from 0 to max
        int[] freq=new int[max+1];
        //count the freq of each number
        for(int i=0;i<len;i++)
        freq[arr[i]]++;
           
        int k=0;
        for(int i=0;i<=max;i++)
        {
            for(int j=0;j<freq[i];j++)
            {
                arr[k++]=i;
            }
        }
        System.out.println("By non effective method");
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int len=sc.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter the ellemnts of the array");
        for(int i=0;i<len;i++)//1,2,5
        arr[i]=sc.nextInt();
        //sort(arr);
        count_sort(arr);
        System.out.println("The sorted array is:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
