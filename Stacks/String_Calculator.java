import java.util.*;
class String_Calculator //or infix evaluation
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the string of numbers and operations: ");
        String str = sc.nextLine();     
        str = str.replaceAll(" ", ""); // remove spaces
        int len= str.length();

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();  

        for(int i=0;i<len;i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii>=48 && ascii<=57) // if number
            val.push(ch - '0');  // only single-digit supported

            //for no bracket version remove lines from 24 to 48 and bracket condition in line 53
            else if(ch == '(')
            op.push(ch);

            else if(ch == ')')
            {
                while(op.peek() != '(') 
                {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char oper = op.pop();

                    if(oper=='+') 
                    val.push(v1+v2);

                    else if(oper=='-') 
                    val.push(v1-v2);

                    else if(oper=='*') 
                    val.push(v1*v2);

                    else if(oper=='/') 
                    val.push(v1/v2);
                }
                op.pop(); // remove '(' from stack
            }
            else // operator
            {
                int prec = (ch=='+' || ch=='-') ? 1 : 2;

                while(!op.isEmpty() && op.peek()!='(')
                {
                    int topPrec = (op.peek()=='+' || op.peek()=='-') ? 1 : 2;
                    if(topPrec >= prec) 
                    {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        char oper = op.pop();

                        if(oper=='+') 
                        val.push(v1+v2);

                        else if(oper=='-') 
                        val.push(v1-v2);

                        else if(oper=='*') 
                        val.push(v1*v2);

                        else if(oper=='/') 
                        val.push(v1/v2);
                    } 
                    else 
                    break;
                }
                op.push(ch);
            }
        }

        // process remaining
        while(!op.isEmpty()) 
        {
            int v2 = val.pop();
            int v1 = val.pop();
            char oper = op.pop();

            if(oper=='+') 
            val.push(v1+v2);

            else if(oper=='-') 
            val.push(v1-v2);

            else if(oper=='*') 
            val.push(v1*v2);

            else if(oper=='/') 
            val.push(v1/v2);
        }
        System.out.println("Answer=" + val.peek());
    }
}