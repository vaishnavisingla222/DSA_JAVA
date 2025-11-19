import java.util.*;
class Heap_Basics 
{
    static int size=0;
    static int[] arr=new int[100];

    public static void insert(int val)//O(log n)
    {
        int ind=size;
        arr[ind]=val;
        size++;

        while (ind>0) 
        {
            int parent=(ind-1)/2;
            if (arr[parent]<arr[ind]) 
            {
                int temp=arr[parent];
                arr[parent]=arr[ind];
                arr[ind]=temp;
                ind=parent;
            } 
            else
                return;
        }
    }

    public static void deleteRoot() 
    {
        if (size==0)
        {
            System.out.println("Heap is empty");
            return;
        }
        arr[0]=arr[size-1];
        size--;
        int i=0;
        while (true) 
        {
            int li=2*i+1;
            int ri=2*i+2;
            int largest=i;

            if (li<size && arr[li]>arr[largest]) 
                largest = li;
            if (ri<size && arr[ri]>arr[largest]) 
                largest=ri;

            if (largest!=i)
            {
                int temp=arr[i];
                arr[i]=arr[largest];
                arr[largest]=temp;
                i=largest;
            } 
            else
                break;
        }
    }

    public static void printHeap() 
    {
        for(int i=0;i<size;i++) 
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[]) 
    {
        Heap_Basics h=new Heap_Basics();
        h.insert(50);
        h.insert(55);
        h.insert(53);
        h.insert(52);
        h.insert(54);

        h.printHeap();//heap order(root first)
        h.deleteRoot();//remove max(root)
        h.printHeap();
    }
}
