import java.util.*;
class PrefixToPostfix 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Prefix equation: ");
        String prefix=sc.nextLine();
        Stack<String> val= new Stack<>();
        int len=prefix.length();
        for(int i=len-1;i>=0;i--)
        {
            char ch=prefix.charAt(i);
            int ascii=(int)ch;

            if(ascii>=48 && ascii<=57)
            val.push(ch+"");

            else
            {
                String v1=val.pop();
                String v2=val.pop();
                char op=ch;
                val.push(v1+v2+op);
            }
        }
        System.out.println("Answer="+val.peek());
    }
}