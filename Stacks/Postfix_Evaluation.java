import java.util.*;
class Postfix_Evaluation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the postfix equation: ");
        String postfix=sc.nextLine();
        Stack<Integer> val= new Stack<>();
        int len=postfix.length();
        for(int i=0;i<len;i++)//loop start from start to end
        {
            char ch=postfix.charAt(i);
            int ascii=(int)ch;

            if(ascii>=48 && ascii<=57)
            val.push(ascii-'0');

            else
            {
                int v2=val.pop();//v2 then v1
                int v1=val.pop();

                if(ch=='+')
                val.push(v1+v2);

                if(ch=='-')
                val.push(v1-v2);

                if(ch=='*')
                val.push(v1*v2);

                if(ch=='/')
                val.push(v1/v2);
            }
        }
        System.out.println("Answer="+val.peek());
    }
}