import java.util.*;
class swap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Original numbers: a="+a+"; b="+b);
        a=a^b;
        b=a^b; // (a^b)^b=a
        a=a^b; // (a^b)^a=b
        System.out.println("Swapped numbers: a="+a+"; b="+b);
    }
}
