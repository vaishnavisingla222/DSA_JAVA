class HeapifyAlgo// making the array heap 
{
    public static void heapify(int arr[],int n, int i,boolean inc)//T.C=O(log n)
    {
        int large=i;
        int left=2*i+1;
        int right=2*i+2;

        if(inc)
        {
            if(left<n && arr[large]<arr[left])
            large=left;
            if(right<n && arr[large]<arr[right])
            large=right;
        }
        else
        {
            if (left<n && arr[left]<arr[large])
            large=left;
            if (right<n && arr[right]<arr[large])
            large=right;
        }

        if(large!=i)
        {
            //Swap
            int temp=arr[large];
            arr[large]=arr[i];
            arr[i]=temp;

            heapify(arr,n,large,inc);
        }
    }
    public static void heapSort(int arr[], int n, boolean inc)
    {
        for (int i=n/2-1;i>=0;i--)
        heapify(arr,n,i,inc);

        for (int i=n-1;i>0;i--) 
        {    
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
      
            heapify(arr,i,0,inc);
        }
    }
    public static void main(String args[])
    {
        int[] arr={54,53,55,52,50};
        int n=5; 
        boolean inc=true;//if sorting to be done in increasing order else false to sort in decreasing order

        heapSort(arr,n,inc);

        System.out.print("Sorted array: ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");

        System.out.println();
    }
}
