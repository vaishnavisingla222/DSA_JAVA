import java.util.*;
class Sum_Natural
{
    public static int add(int num,int sum)
    {
        if(num==1)
        return 1;
        sum=sum+num;
        add(num-1,sum);
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms to be sum up: ");
        int n=sc.nextInt();
        int sum=0;
        add(n,sum);
        System.out.println("The summation="+sum);
    }
}