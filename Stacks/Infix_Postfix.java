import java.util.*;
class Infix_Postfix 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string of equation: ");
        String infix = sc.nextLine();
        infix = infix.replaceAll(" ", "");
        
        Stack<Character> op = new Stack<>();
        Stack<String> val = new Stack<>(); // to form new string (prefix)
        
        int len = infix.length();

        for(int i=0;i<len;i++)
        {
            char ch = infix.charAt(i);
            int ascii = (int)ch;

            if(ascii>=48 && ascii<=57) // operand (digit)
            {
                val.push(Character.toString(ch));
            }
            else if(ch == '(')
            {
                op.push(ch);
            }
            else if(ch == ')')
            {
                while(op.peek() != '(') 
                {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char oper = op.pop();

                    val.push(v1 + v2 + oper);
                }
                op.pop(); // remove '('
            }
            else // operator
            {
                int prec = (ch=='+' || ch=='-') ? 1 : 2;

                while(!op.isEmpty() && op.peek()!='(') 
                {
                    int topPrec = (op.peek()=='+' || op.peek()=='-') ? 1 : 2;
                    if(topPrec >= prec) 
                    {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char oper = op.pop();

                        val.push(v1 + v2 + oper);
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
            String v2 = val.pop();
            String v1 = val.pop();
            char oper = op.pop();

            val.push(v1 + v2 + oper);
        }

        System.out.println("Answer=" + val.peek());
    }
}
