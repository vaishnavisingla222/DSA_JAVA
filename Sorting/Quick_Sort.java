import java.util.*;

class Quick_Sort {

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int partition(int st, int arr[], int end) {
        int pivot = arr[st];
        int count = 0;

        // Count elements <= pivot
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot)
                count++;
        }

        int pivind = count + st;
        swap(arr, st, pivind);

        int i = st, j = end;
        while (i < pivind && j > pivind) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < pivind && j > pivind) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivind;
    }

    public static void sort(int arr[], int st, int end) {
        if (end < st) {
            return;
        }
        int pivot = partition(st, arr, end);
        sort(arr, st, pivot - 1);
        sort(arr, pivot + 1, end);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int len = sc.nextInt();
        int arr[] = new int[len];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();

        sort(arr, 0, len - 1);

        System.out.println("The sorted array is:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
