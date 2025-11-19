import java.util.*;
class Basics_HashMap 
{
    public static void main(String args[])
    {
        //Create
        HashMap<String,Integer> age=new HashMap<>();//String is key -> Integer is its value

        //Adding Elements->T.C=O(1)
        age.put("Akash",21);
        age.put("Yash",16);
        age.put("Luv",17);
        age.put("Rishika",19);
        age.put("Harry",18);


        //Getting value of a key->T.C=O(1)
        System.out.println(age.get("Yash"));//16
        System.out.println(age.get("Rocky"));//null as it not exist
        

        //changing or updating value of key->T.C=O(1)
        age.put("Akash",43);
        System.out.println(age.get("Akash"));//43


        //removing a pair->T.C=O(1)
        System.out.println(age.remove("Luv"));//17
        System.out.println(age.remove("Rocky"));//null-dont give error


        //check if key exist->T.C=O(1)
        System.out.println(age.containsKey("Harry"));//true
        System.out.println(age.containsKey("Rocky"));//false


        //add if not present->T.C=O(1)
        if(!age.containsKey("Yahika"))//will enter
        age.put("Yashika",30);
        //Alternative or short form:
        age.putIfAbsent("Gautam",50);///will not enter
        

        //Printing->T.C=O(n)
        System.out.println(age.keySet());//Get all the keys 
        System.out.println(age.values());//Get all the values
        System.out.println(age.entrySet());//or just "age" in place of "age.entrySet"-to get all the values+key
        System.out.println();


        //Traverse HashMap->T.C=O(n)
        for(String key:age.keySet())//1st Method
        System.out.printf("Age of %s is %d\n",key,age.get(key)); 
        System.out.println(); 

        for(Map.Entry<String,Integer> e:age.entrySet())//2nd method
        System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        System.out.println();

        for(var e:age.entrySet())//3rd method-We even dont need to write type
        System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
    }
}
