import java .util.*;
class Move_String
{
    public static void move(int pos, int count, String nstr,char ch,String str)
    {
        if(pos==str.length())
        {
            System.out.print("the modified string is: "+nstr);
            for(int i=0;i<count;i++)
            System.out.print(ch);

            return;
        }
        char check=str.charAt(pos);
        if(check==ch)
        {
            count++;
            move(pos+1,count,nstr,ch,str);
        }
        else
        {
            nstr=nstr+check;
            move(pos+1,count,nstr,ch,str);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String str="axbcxxd";
        char ch='x';
        move(0,0,"",ch,str);
    }
}