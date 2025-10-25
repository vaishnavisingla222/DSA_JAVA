import java.util.*;
class Balanced_Brackets 
{
    public static int remove(String str)
    {
        Stack<Character> st=new Stack<>();
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch=='(')
            st.push(ch);

            else if(ch==')' && st.size()!=0)
            st.pop();

            else
            count++;// extra )
        }
        if(st.size()!=0)
        return st.size()+count;// extra ( + extra )

        return count;
    }
    public static boolean isBalanced(String str)
    {
        Stack<Character> st=new Stack<>();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch=='(')//put ( in stack
            st.push(ch);

            else if(ch==')' && st.size()!=0)// ) is there and ( is also there remove both
            st.pop();

            else
            return false;//i.e extra ) there is no ( for matching
        }
        if(st.size()!=0)
        return false;// i.e there is extra '(' no ')'

        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(); 
        boolean check=isBalanced(str);

        if(check==false)
        System.out.println("Number of brackets to be removed= "+remove(str));
        else
        System.out.println("The string is balnced so need to remove any bracket");
    }
}
