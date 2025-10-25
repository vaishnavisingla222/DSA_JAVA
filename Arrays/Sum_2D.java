import java.util.*;
public class Sum_2D {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array first row then column");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the coordinates of starting first row then column");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter the coordinates of ending first row then column");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        System.out.println("Enter the ellements");
        for(int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=r1;i<=r2;i++)
        {
            for (int j=c1;j<=c2;j++)
            {
                sum=sum+arr[i][j];
            }
        }
        System.out.println("The summation= "+sum);
    }
}
