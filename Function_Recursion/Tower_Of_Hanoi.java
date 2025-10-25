import java.util.*;
class Tower_Of_Hanoi
{
    public static void tower(int n, char s,char h,char d)// n is number of discs, s is source; h is helper; d is destination
    {
        if(n==0)
        return;
            
        tower(n-1,s,d,h);//first (total-1) discs will move to source to helper
        System.out.println(s+" -> "+d);// last disc will got to source to destination 
        tower(n-1,h,s,d);// noe the first (total-1) discs will go to helper to destination

        return;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter number of discs: ");
      int total=sc.nextInt();
      tower(total,'A','B','C');
    }
}