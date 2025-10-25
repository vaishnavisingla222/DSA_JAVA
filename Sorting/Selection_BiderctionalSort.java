import java.util.*;
class Selection_BiderctionalSort 
//sorting from both the sides ie finding both minimum and maximum
{
    public static void sort(int arr[], int size) 
    {
        int st = 0, end = size - 1;

        while (st < end) 
        {
            int min = st;
           // int max = end;

            // find minimum and maximum
            for (int i = st; i <= end; i++) 
            {
                if (arr[i] < arr[min])
                    min = i;
                //if (arr[i] > arr[max])
                  //  max = i;
            }

            // swap min with start
            if (min != st) 
            {
                int temp = arr[st];
                arr[st] = arr[min];
                arr[min] = temp;
            }

            //if (max == st)// if max was at start, it moved to min after the above swap
               /// max = min;

            // swap max with end
            /*if (max != end) 
            {
                int temp = arr[end];
                arr[end] = arr[max];
                arr[max] = temp;
            }*/
            st++;
            //end--;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        sort(arr, size);

        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}