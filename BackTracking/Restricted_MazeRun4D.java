import java.util.Scanner;
public class Restricted_MazeRun4D 
/* How many ways are there to go from (0,0) to (row-1,column-1), in this we can go in all 4 directions not digonally.
 * There is a constraint there are are some dead block where we can't go. */
{
    public static void print(int sr,int sc,int er,int ec,String s, boolean check[][],int maze[][])
    {
        if(sr<0 || sc<0)
        return;
        else if(sr>er || sc>ec)
        return;
        else if (maze[sr][sc]==-1)//else if(check[sr][sc]==true)
        return;
        else if(maze[sr][sc]==0)
        return;
        else if (sr==er && sc==ec)
        {
            System.out.println(s);
            return;
        }
        check[sr][sc]=true;
        maze[sr][sc]=-1;
        print(sr+1,sc,er,ec,s+"D",check,maze);//going down
        print(sr,sc+1,er,ec,s+"R",check,maze);//going right
        print(sr-1,sc,er,ec,s+"U",check,maze);// going up
        print(sr,sc-1,er,ec,s+"L",check,maze);// going left
        check[sr][sc]=false;//BackTracking
        maze[sr][sc]=1;//Backtracking
    }
    public static int path(int sr, int sc, int er, int ec, boolean check[][],int maze[][]) 
    {
        if(sc<0 || sr<0)
        return 0;
        else if(sr>er || sc>ec)
        return 0;
        else if(maze[sr][sc]==-1)//else if(check[sr][sc]==true)
        return 0;
        else if(maze[sr][sc]==0)
        return 0;
        else if (sr==er && sc==ec)
        return 1;
        check[sr][sc]=true;
        maze[sr][sc]=-1;
        int downways= path(sr+1,sc,er,ec,check,maze);
        int rightways=path(sr,sc+1,er,ec,check,maze);
        int upways=path(sr-1,sc,er,ec,check,maze);
        int leftways=path(sr,sc-1,er,ec,check,maze);
        check[sr][sc]=false;//BackTracking
        maze[sr][sc]=1;//BackTracking
        int totalways= downways+rightways+upways+leftways;
        return totalways;
    }
    public static void main(String[] args) 
    {
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
            {
                maze[i][j]=sc.nextInt();
            }
        }
        boolean check1[][]=new boolean[r][c];// this can be avoided by using maze as it is given in alternative
        int ways=path(0,0,r-1,c-1,check1,maze);
        boolean check2[][]=new boolean[r][c];
        System.out.println("The number of ways= "+ways);
        System.out.println("Ways:-");
        print(0,0,r-1,c-1,"",check2,maze);
    }    
} 