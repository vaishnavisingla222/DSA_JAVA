public class displayingSLL {
    public static void display2(Node head)
    {
        if (head==null)
        return;
        
        System.out.println(head.data);
        display2(head.next);
    }
    public static void display1(Node head)
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static class Node
    {
        int data;//value
        Node next;//address of next node

        Node(int data)
        {
            this.data=data;
        }
    }
    public static void main(String args[])
    {
        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(1);

        a.next=b;/*linked list is conected by these 4 line */
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println("Method 1- when all the info is given");
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println(e.data);
        
        System.out.println("Method 2- when only head info is given");
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);

        System.out.println("Method 3-when only head info is given and using loop but size is given");
        Node temp=a;//a node pointing at a
        // why temp is needed why not use a in place of temp
        // in that case a will loose its head behviour
        for(int i=0;i<5;i++)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

        System.out.println("Method 4-when only head info is given and using loop and size is not given");
        temp=a;// node pointing at a
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

        System.out.println("Method 5-through functions");
        display1(a);

        System.out.println("Method 6- through recursion");
        display2(a);
    }
}
