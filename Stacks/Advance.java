import java.util.*;
class Advance 
{
    public static Stack<Integer> delete(Stack<Integer> st) 
    {
        int ind=2;// 0 to delete at begining, st.size-1 to delete at last
        Stack<Integer> dst=new Stack <>();
        while(st.size()>0)
        dst.push(st.pop());

        int size=dst.size();
        while(dst.size()>size-ind)
        {
            int x=dst.pop();
            st.push(x);
        }
        dst.pop();
        while(dst.size()>0)
        {
            int x=dst.pop();
            st.push(x);
        }
        return st;
    }
    public static Stack<Integer> insert(Stack<Integer> st,int ind) 
    {
        Stack<Integer> sst=new Stack <>();
        
        while(st.size()>ind)
        sst.push(st.pop());

        st.push(6);
        while(sst.size()>0)
        st.push(sst.pop());

        return st;
    }
    public static Stack<Integer> reverse_iterative(Stack<Integer> st) 
    {
        Stack<Integer> rst=new Stack <>();

        while(st.size()>0)
        rst.push(st.pop());
        /*Simple way is:
        int x=st.peek();
        rt.push(x);
        st.pop();
        */

        return rst;
    }
    public static void insertatbottom(Stack<Integer> st,int x)
    {
        if(st.size()==0)
        {
            st.push(x);
            return;
        }
        int top=st.pop();
        insertatbottom(st,x);
        st.push(top);
        return;
    }
    public static Stack<Integer> reverse_recursion(Stack<Integer> st)  
    {
        if(st.size()==1)
        return st;

        int top=st.pop();
        st=reverse_recursion(st);
        insertatbottom(st,top);
        return st;
    }
    public static Stack<Integer> copy(Stack<Integer> st)  
    {
        Stack<Integer> rst=new Stack <>();

        while(st.size()>0)
        rst.push(st.pop());//copied into another stack in reversed order

        while(rst.size()>0)
        st.push(rst.pop());

        return st;
    }
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack <>();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of ellements");
        int n=sc.nextInt();
        System.out.println("Enter the ellements");
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            st.push(num);
        }//st= 1 2 3 4 5 

        //copy 
        st=copy(st);//1 2 3 4 5
        System.out.println(st);
        System.out.println();
        
        //reverse order
        st=reverse_iterative(st);// 5 4 3 2 1
        System.out.println(st);
        System.out.println();

        st=reverse_recursion(st);//1 2 3 4 5
        System.out.println(st);
        System.out.println();

        //insert at index 
        st=insert(st,2);// 1 2 6 3 4 5
        System.out.println(st);
        System.out.println();

        //delete at index
        st=delete(st);// 1 2 3 4 5
        System.out.println(st);
        System.out.println();
    }
}