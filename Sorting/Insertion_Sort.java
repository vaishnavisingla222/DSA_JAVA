import java.util.Scanner;
class Insertion_Sort {
    public static void sort(int arr[])
    {
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            // always compare the values after checking j's positivity otherwise error will occur since -ve value will be checked
            {
                //swap
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
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
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
