import java.util.*;
public class Frog_Jump {
/*Count number of steps to go to nth stair by going to either by one or two stairs in a single step.*/
public static int path(int n)
{
    if(n<3){return n;}
    int ways=path(n-1)+path(n-2);
    return ways;
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of Stones");
    int stones=sc.nextInt();
    int[] height=new int[stones];
    System.out.println("Enter the height of "+stones+" stones");
    for(int i=0;i<stones;i++)
    {
        height[i]=sc.nextInt();
    }
    int ways=path(stones);
    System.out.println("Number of ways= "+ways);
}
}
