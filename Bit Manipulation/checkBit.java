import java.util.*;
class checkBit // set or not
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of i i.e the ith bit: ");
        int i=sc.nextInt();
        System.out.print("Enter the number to be checked: ");
        int n= sc.nextInt();

        if((n & (1<<i)) != 0) // or (n>>i) & 1 == 1
        System.out.println("Set");
        else
        System.out.println("Not Set");
    }
}
