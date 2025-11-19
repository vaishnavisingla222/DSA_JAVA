import java.util.*;
public class Basics_HashSet
{
    public static void main(String args[])
    {
        //Create
        HashSet<Integer> set=new HashSet<>();


        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);//Add nhi hoga only unique ellements no repetation
        System.out.println("Size: "+set.size());//size set
        System.out.println("Set: "+set);//print set


        //Search
        if(set.contains(1))
            System.out.println("Contians 1");
        else
            System.out.println("Not contain 1");

        if(set.contains(6))
            System.out.println("Contians 6");
        else
            System.out.println("Not contain 6");


        //Delete
        set.remove(1);
        if(set.contains(1))
            System.out.println("Contians 1");
        else
            System.out.println("Not contain 1");

        System.out.println("Size: "+set.size());
        System.out.println("Set: "+set);


        //Iterator- Needs importing
        Iterator it=set.iterator();//works somewhat similar to linkedList little difference
        while(it.hasNext())//checks if there is a next ellement present
        System.out.println(it.next());//prints next ellement and start pointing it
    }
}
