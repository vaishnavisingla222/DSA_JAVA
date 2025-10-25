import java.util.*;
class Occurence_String
{
    public static int first=-1,last=-1;
    public static void find(String sen,int pos,char ellement)
    {
        if(pos==sen.length())
        {
            System.out.println("The first occurence="+first);
            System.out.println("The last occurence="+last);
            return;
        }
        else{
            char ch=sen.charAt(pos);
            if(ch==ellement)
            {
                if(first==-1){
                    first=pos;
                }
                else{
                    last=pos;
                }
            }
        }
        find(sen,pos+1,ellement);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character to be checked: ");
        char ch=sc.next().charAt(0);
        System.out.println("Enter the string to be used for refference:");
        String str=sc.next();
        int length=str.length();
        find(str,0,ch);
    }
}