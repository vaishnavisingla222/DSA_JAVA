import java.util.*;
class convertToBinary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int n=sc.nextInt();
        String res="";
        while(n>0)
        {
            if(n%2==0)
            res+='0';
            else
            res+='1';

            n=n/2;
        }
        String ans="";
        for(int i=res.length()-1;i>=0;i--)
        ans+=res.charAt(i);

        System.out.println("Binary: "+ans);
    }
}
