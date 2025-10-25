import java.util.*;
class Fibonacci
{
    public static void fibonacci(int a,int b,int num){
        if(num==0)
        {
            return;
        }
        int sum=a+b;
        a=b;
        b=sum;
        System.out.println(sum);
        fibonacci(a,b,num-1);
        return;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1;
        System.out.println("Enter number of terms to be printed: ");
        int n=sc.nextInt();
        System.out.println("The series is ");
        System.out.println(a);
        System.out.println(b);
        fibonacci(a,b,n-2);
    }
}