/* Basically you are creating an array making it work as stack.
 * when you are push then you have to make a push function for it like that
 */
class Array_Implementation {
    public static class Stack
    {
        private int[] arr= new int[5];
        private int indx=0;
        void push(int x)
        {
            if (isFull()) 
            {
                System.out.println("Stack is full");
                return;
            }

            arr[indx]=x;
            indx++;
            return;
        }
        int peek()
        {
            if(indx==0)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[indx-1];
        }
        int pop()//remove the upper ellemnt
        {
            if(indx==0)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            int top=arr[indx-1];
            arr[indx-1]=0;
            indx--;
            return top;
        }
        void display()
        {
            for(int i=0;i<=indx-1;i++)
            System.out.print(arr[i]+" ");

            System.out.println();
            return;
        }
        int size()
        {
            return indx;
        }
        boolean isFull()
        {
            return (indx==arr.length)
            /*if(indx==arr.length)
            return true;

            return false;*/
        }
        boolean isEmpty()
        {
            return(indx==0)
            /*if(indx==0)
            return true;

            return false;*/
        }
        int capacity()
        {
            return arr.length;
        }
    }   
    public static void main(String[] args) 
    {
        Stack st=new Stack();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        int size=st.size(); 
        System.out.println(size);
        st.display();
        System.out.println(st.pop()); 
        st.display();
        st.push(6);
        st.display();
        st.push(7);
        st.display();
    }
}