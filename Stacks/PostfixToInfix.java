import java.util.*;
class PostfixToInfix 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Postfix Equation: ");
        String postfix=sc.nextLine();
        Stack<String> val=new Stack<>();
        int len=postfix.length();
        for (int i=0;i<len;i++)
        {
            char ch=postfix.charAt(i);
            int ascii=(int)ch;
            
            if(ascii>=48 && ascii<=57)
            val.push(ch+"");

            else
            {
                String v2=val.pop();
                String v1=val.pop();
                char op=ch;
                val.push("("+v1+op+v2+")");
            }
        }
        System.out.println("Answer="+val.peek());
    }
}