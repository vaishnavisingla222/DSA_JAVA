import java.util.Scanner;
class Selection_Sort {
    public static void sort(int arr[])
    {
        int len=arr.length;
        for(int i=0;i<len-1;i++)
        {
            //find minimum ellement in complete array
            int minind=i;
            for(int j=i+1;j<len;j++)
            {
                if(arr[j]<arr[i])
                minind=j;
            }
            //swap cuurent ellement(arr[i]) and min ellement(arr[minind])
                int temp=arr[i];
                arr[i]=arr[minind];
                arr[minind]=temp;
        }
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int len = sc.nextInt();
        int arr[] = new int[len];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();

        sort(arr);

        System.out.println("The sorted array is:");
        for (int i = 0; i < len; i++)
        System.out.print(arr[i] + " ");

        System.out.println();
    }
}