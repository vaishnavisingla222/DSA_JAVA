import java.util.*;
public class Restricted_MazeRun2D 
/*How many ways are there to go from (0,0) to (row-1,column-1), 
constaint is we can only go down or right.Also there are are some dead block where we can't go. */
{
    public static void print(int sr,int sc,int er,int ec,String s,int maze[][])
    {
        if(sr>er || sc>ec)
        return;
        else if(maze[sr][sc]==0)
        return;
        else if (sr==er && sc==ec)
        {
            System.out.println(s);
            return;
        }
        print(sr+1,sc,er,ec,s+"D",maze);//going down
        print(sr,sc+1,er,ec,s+"R",maze);//going right
    }
    public static int path(int sr, int sc, int er, int ec,int maze[][]) 
    {
        if(sr>er || sc>ec)
        return 0;
        else if(maze[sr][sc]==0)
        return 0;
        else if (sr==er && sc==ec)
        return 1;
        int downways= path(sr+1,sc,er,ec,maze);
        int rightways=path(sr,sc+1,er,ec,maze);
        int totalways= downways+rightways;
        return totalways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int maze[][]=new int[r][c];
        System.out.println("Enter the situation i.e 1 for active blocks 0 for dead blocks");
        for(int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            maze[i][j]=sc.nextInt();
        }
        int ways=path(0,0,r-1,c-1,maze);
        System.out.println("The number of ways= "+ways);
        System.out.println("Ways:-");
        print(0,0,r-1,c-1,"",maze);
    }    
}
