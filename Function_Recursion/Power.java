import java.util.*;
class Power
{
    public static int power(int b,int pow)
    {
        if(pow==0)
        return 1;
        int res=b*power(b,pow-1);
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base");
        int x=sc.nextInt();
        System.out.println("Enter the power");
        int n=sc.nextInt();
        int res=power(x,n);
        System.out.println("The result="+res);
    }
}