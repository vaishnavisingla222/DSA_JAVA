import java.util.*;
class Reverse_String
{
    public static void rev(String sen,int pos)
    {
        if(pos==0)
        {
            System.out.print(sen.charAt(pos));
            return;
        }
        System.out.print(sen.charAt(pos));
        rev(sen,pos-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be reversed");
        String str=sc.next();
        int length=str.length();
        rev(str,length-1);
    }
}