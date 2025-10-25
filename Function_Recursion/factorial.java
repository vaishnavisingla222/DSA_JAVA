import java.util.*;
class factorial
{
    public static int factorial(int n)
    {
        if(n==1)
        return 1;
        int fac=n*factorial(n-1);
        return fac;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the number whose  factorial has to be printed: ");
        num=sc.nextInt();
        int fac=factorial(num);
        System.out.println("The factorial of the number="+fac);
    }
}