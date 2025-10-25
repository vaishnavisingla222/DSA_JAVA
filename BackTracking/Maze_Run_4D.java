import java.util.*;
public class Maze_Run_4D
/* How many ways are there to go from (0,0) to (row-1,column-1), in this we can go in all 4 directions not digonally. */
{
    public static void print(int sr,int sc,int er,int ec,String s, boolean check[][])
    {
        if(sr<0 || sc<0)
        return;
        else if(sr>er || sc>ec)
        return;
        else if(check[sr][sc]==true)//V.imp
        return;
        else if (sr==er && sc==ec)
        {
            System.out.println(s);
            return;
        }
        check[sr][sc]=true;
        print(sr+1,sc,er,ec,s+"D",check);//going down
        print(sr,sc+1,er,ec,s+"R",check);//going right
        print(sr-1,sc,er,ec,s+"U",check);// going up
        print(sr,sc-1,er,ec,s+"L",check);// going left
        check[sr][sc]=false;//BackTracking
    }
    public static int maze(int sr, int sc, int er, int ec, boolean check[][]) 
    {
        if(sc<0 || sr<0)
        return 0;
        else if(sr>er || sc>ec)
        return 0;
        else if(check[sr][sc]==true)
        return 0;
        else if (sr==er && sc==ec)
        return 1;
        check[sr][sc]=true;
        int downways= maze(sr+1,sc,er,ec,check);
        int rightways=maze(sr,sc+1,er,ec,check);
        int upways=maze(sr-1,sc,er,ec,check);
        int leftways=maze(sr,sc-1,er,ec,check);
        check[sr][sc]=false;//BackTracking
        int totalways= downways+rightways+upways+leftways;
        return totalways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
       /*V.V.V..IMP */ boolean check1[][]=new boolean[r][c];// by default all are false
        int ways=maze(0,0,r-1,c-1,check1);
        boolean check2[][]=new boolean[r][c];
        System.out.println("The number of ways= "+ways);
        System.out.println("Ways:-");
        print(0,0,r-1,c-1,"",check2);
    }    
}

