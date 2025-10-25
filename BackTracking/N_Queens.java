import java.util.*;
class N_Queens 
{
    public static boolean isSafe(int n,char board[][], int row,int col)
    {
        for (int j=0;j<n;j++)
        {
            if(board[j][col]=='Q')//check column
            return false;
        }
        for (int j=0;j<n;j++)
        {
            if(board[row][j]=='Q')//check row
            return false;
        }
        int i=row,j=col;
        while(i>=0 && j<n)
        {
            if(board[i][j]=='Q')// check north east
            return false;
            i--;j++;
        }
        i=row;j=col;
        while(i<n && j<n)
        {
            if(board[i][j]=='Q')// check south east
            return false;
            i++;j++;
        }
        i=row;j=col;
        while(i<n && j>=0)
        {
            if(board[i][j]=='Q')// check south west
            return false;
            i++;j--;
        }
        i=row;j=col;
        while(i>=0 && j>=0)
        {
            if(board[i][j]=='Q')// check north west
            return false;
            i--;j--;
        }
        return true;
    }
    public static int ways(int count,int n, char[][] board, int row)
    {
        if(row==n)
        {
            count++;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                System.out.print(board[i][j]+" ");

                System.out.println();
            }
            System.out.println();
            return count;
        }
        for(int j=0;j<n;j++)
        {
            if(isSafe(n,board,row,j))
            {
                board[row][j]='Q';
                count=ways(count,n,board,row+1);
                board[row][j]='X';// backTracking
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of chess board");
        int n=sc.nextInt();
        char[][] board=new char[n][n];// to store Q and x
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            board[i][j]='X';
        }
        int ways=ways(0,n,board,0);//first 0 is for count the number of ways, second 0 is for checking which row has to be filled withe the queen
        System.out.println("Total ways= "+ways);
    }
}