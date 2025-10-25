import java.util.*;
class Two_D_Array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        int k=1;
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                arr[i][j]=k;
                k++;
            }
        }
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
