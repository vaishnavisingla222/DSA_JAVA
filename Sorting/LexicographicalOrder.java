import java.util.*;

public class LexicographicalOrder 
{
    public static void sort2(String fruits[])// using selection sort
    {
        int len=fruits.length;
        for(int i=0;i<len-1;i++)
        {
            int minind=i;
            for(int j=i+1;j<len;j++)
            {
                if(fruits[j].compareTo(fruits[minind])<0)
                minind=j;
            }
            //swap cuurent ellement(FRUITS[i]) and min ellement(FRUITS[minind])
                String temp=fruits[i];
                fruits[i]=fruits[minind];
                fruits[minind]=temp;
        }
        return;
    }
    public static void sort1(String fruits[])// using collection framework
    {
        Arrays.sort(fruits); // Sort the array alphabetically
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Number of fruits you want to enter?");
        int num = sc.nextInt();
        sc.nextLine();   /* very much needed
        if not written then a blank space is also taken into consideration as a fruit when you type enter */
        String[] fruits = new String[num]; 
        System.out.println("Enter the names of the fruits:");
        for (int i = 0; i < num; i++)
        fruits[i] = sc.nextLine(); 
      
        /*sort1(fruits);//collection framework
        OR*/
        sort2(fruits);//sorting
        System.out.println("Fruits in lexicographical (alphabetical) order:");
        for (String fruit : fruits)// enhanced form
        System.out.println(fruit);
            
        //alternative
        /*
         * for (int i = 0; i < fruits.length; i++) {
           String fruit = fruits[i];
           System.out.println(fruit);
         } 
         */
    }
}
