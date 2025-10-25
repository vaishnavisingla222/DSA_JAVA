public class BasicsSLL {
    public static class Node{
        int data;//value
        Node next;//address of next node
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String args[]){
        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(1);
        a.next=b;/*linked list is formed by these 4 line */
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(b);//address of b
        System.out.println(b.data);//value of b
    }
}
