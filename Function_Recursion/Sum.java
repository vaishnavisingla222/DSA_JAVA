import java.util.*;
class Sum
{
    public static int sum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter two numbers one by one: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int sum=sum(a,b);
        System.out.println("The sum= "+sum);
    }
}