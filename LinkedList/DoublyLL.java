class DoublyLL 
{
    public static class Node
    {
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;       
        }
    }
    public static void display_random(Node random)
    {
        Node temp=random;

        //first go back to head
        while(temp.prev!=null)
        temp=temp.prev;

        //now print
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void reverse(Node tail)
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node insertion_head(Node head)
    {
        Node t=new Node(6);
        t.next=head;
        head.prev=t;
        head=t;
        display(head);
        return head;
    }
    public static Node insertion_tail(Node head,Node tail)
    {
        Node t=new Node(6);
        tail.next=t;
        t.prev=tail;
        display(head);
        return t;
    }
    public static void insertion_random(Node head,int indx)
    {
        if(indx==0)
        insertion_head(head);

        Node t=new Node(6);
        Node temp=head;
        while(indx-1>0)
        {
            temp=temp.next;
            indx--;
        }
        if(temp.next==null)
        insertion_tail(head,temp);

        temp.next.prev=t;
        t.next=temp.next;
        temp.next=t;
        t.prev=temp;
        display(head);
    }
    public static Node delete_head(Node head)
    {
        head=head.next;
        head.prev=null;
        display(head);
        return head;
    }
    public static void delete_tail(Node head,Node tail)
    {
        tail.prev.next=null;
        display(head);
    }
    public static void delete_indx(Node head,int indx)
    {
        if(indx==0)
        delete_head(head);

        Node temp=head;
        while (indx>1) {
            temp=temp.next;
            indx--;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
        display(head);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);

        //connect forward
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;// by default e.next=null

        //now back connect
        b.prev=a;//by default a.prev=null
        c.prev=b;
        d.prev=c;
        e.prev=d;
        display(a);//1 2 3 4 5- to display when head is given
        reverse(e);//5 4 3 2 1- to display when tail is given in reverse order
        display_random(c);//1 2 3 4 5- when any random node is given
        a=insertion_head(a);// 6 1 2 3 4 5
        Node f=insertion_tail(a,e);//6 1 2 3 4 5 6
        insertion_random(a,3);//6 1 2 6 3 4 5 6
        a=delete_head(a);//a=1; 1 2 6 3 4 5 6
        delete_tail(a,f);// 1 2 6 3 4 5
        delete_indx(a,2);//
    }
}
