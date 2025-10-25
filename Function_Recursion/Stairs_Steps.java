import java.util.*;
public class Stairs_Steps 
{
/*Count number of steps to go to nth stair by going to either by one or two stairs in a single step.*/
public static void print_ways(int n)
{
    
}
public static int path(int n)
{
    if(n<3)
    return n;

    int ways=path(n-1)+path(n-2);//total ways= (number of ways to go by 1 step at a time) + (number of ways to go by 2 steps at a time)

    return ways;
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of Stairs: ");
    int stairs=sc.nextInt();
    int ways=path(stairs);
    System.out.println("Number of ways= "+ways+" which are as follows: ");
    print_ways(stairs);
}
}
