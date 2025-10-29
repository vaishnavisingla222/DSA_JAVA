import java.util.*;
public class Bucket_Sort 
{
    public static void bucket_sort(int[] arr)
    {
        int len=arr.length;
        //make buckets
        ArrayList<Integer>[] bucket=new ArrayList[len];
        for(int i=0;i<len;i++)
        bucket[i]=new ArrayList<Integer>();//empty buckets

        // Find maximum element to scale bucket index properly
        int max=arr[0];
        for (int i=1;i<len;i++) 
        {
            if (arr[i]>max)
            max = arr[i];
        }

        //Add ellements into our buckets
        for(int i=0;i<len;i++)
        {
            //int bucketind=len*arr[i];//this gives error overflow
            int bucketind=(arr[i]*len)/(max + 1);//scaled to 0 to len-1
            if (bucketind>=len)
            bucketind=len-1;//avoid overflow

            bucket[bucketind].add(arr[i]);
        }
        //Sort each bucket individually
        for(int i=0;i<bucket.length;i++)
        Collections.sort(bucket[i]);

        //merge all the sorted bucket
        int ind=0;
        for(int i=0;i<bucket.length;i++)
        {
            ArrayList<Integer> currBuck= bucket[i];
            for(int j=0;j<currBuck.size();j++)
            arr[ind++]=currBuck.get(j);
        }
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

        bucket_sort(arr);
        System.out.println("The sorted array is:");
        for (int i = 0; i < len; i++)
        System.out.print(arr[i] + " ");
        
        System.out.println();
    }
}
