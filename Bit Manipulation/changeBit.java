import java.util.*;
class changeBit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of i i.e the ith bit: ");
        int i=sc.nextInt();
        System.out.print("Enter the number: ");
        int n= sc.nextInt();

        int ans=n | 1<<i; // set Bit
        System.out.println("The changed number: "+ans);

        ans=n & ~(1<<i); // clear Bit
        System.out.println("The changed number: "+ans);

        ans= n ^ (1<<i); // toggle bit i.e 0->1 1->0
        System.out.println("The changed number: "+ans);
    }
}
