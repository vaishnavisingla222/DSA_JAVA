import java.util.*;
class Prefix_Evaluation
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Prefix equation: ");
        String prefix=sc.nextLine();
        Stack<Integer> val= new Stack<>();
        int len=prefix.length();
        for(int i=len-1;i>=0;i--)//from end to start
        {
            char ch=prefix.charAt(i);
            int ascii=(int)ch;

            if(ascii>=48 && ascii<=57)
            val.push(ascii-'0');

            else
            {
                int v1=val.pop();// v1 to v2
                int v2=val.pop();

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