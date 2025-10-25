import java.util.*;
public class MazeRun_2D
/* How many ways are there to go from (0,0) to (row-1,column-1), constaint is we can onyly go down or right. */
{
    public static void print(int sr,int sc,int er,int ec,String s)
    {
        if(sr>er || sc>ec)
        return;
        else if (sr==er && sc==ec)
        {
            System.out.println(s);
            return;
        }
        print(sr+1,sc,er,ec,s+"D");//going down
        print(sr,sc+1,er,ec,s+"R");//going right
    }
    public static int maze(int sr, int sc, int er, int ec) 
    {
        if(sr>er || sc>ec)
        return 0;
        else if (sr==er && sc==ec)
        return 1;
        int downways= maze(sr+1,sc,er,ec);
        int rightways=maze(sr,sc+1,er,ec);
        int totalways= downways+rightways;
        return totalways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int ways=maze(0,0,r-1,c-1);
        System.out.println("The number of ways= "+ways);
        System.out.println("Ways:-");
        print(0,0,r-1,c-1,"");
    }    
}
