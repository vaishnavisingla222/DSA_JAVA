public class LinkedList_Implementation 
{
    public static class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
        }
    }
    public static class Stack
    {
        Node head=null;
        int size=0;

        void push(int x)
        {
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop()
        {
            if(head==null)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            int value= head.val;
            head=head.next;
            return value;
        }
        int peek()
        {
            if(head==null)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
        void displayrec(Node h)
        {
            if(h==null)
            return;

            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.println(temp.val+" ");
                temp=temp.next;
            }
        }
        void display_reverse()
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            System.out.println();
        }
        int size()
        {
            return  size;
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