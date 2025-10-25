/** sort 6,3,8,5,2,9 */
import java.util.*;
class Merge_Sort
{
    public static void conquer(int arr[],int si,int mid, int ei)
    {
        int ls=mid-si+1;//size of left array;
        int rs=ei-mid;// size of right array;
        int[] left=new int[ls];// left array
        int[] right=new int[rs];// right array
        for(int i=0;i<ls;i++)// fill left array
        {
            left[i]=arr[i+si];// from 0 to mid
        }
        for(int j=0;j<rs;j++)//fill right array
        {
            right[j]= arr[mid+1+j];// from mid+1 to end
        }
        // now lets over write the original array
        int i=0,j=0;
        int k=si;//bcz when recurssively the array to be taken into consideration index doesnt start from 0
        while(i<ls && j<rs)// till any of the array overs
        {
            if (left[i]<right[j])
            {
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        // fill the left over ellement of other array
        while(i<ls)
        {
            arr[k++]=left[i++];
        }
        while(j<rs)
        {
            arr[k++]=right[j++];
        }

    }
    public static void divide(int arr[],int si,int ei)
    {
        if(si>=ei){       
         return; // since array is already sorted 
        }
    int mid=si+(ei-si)/2;// it will not create out of bound problem otherwise it can go beyond the storage capacity
    divide(arr, si, mid);// divide the first part i.e from starting to  mid index
    divide(arr,mid+1,ei);// divide the second part i.e from mid+1 and ending index
    conquer(arr,si,mid,ei);// merge the divided part from si to mid and then from mid+1 to ei
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

        divide(arr,0,len-1);// to devide arr from 0 to len-1
        
        System.out.println("The sorted array is:");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}