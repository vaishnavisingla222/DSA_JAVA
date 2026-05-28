import java.util.*;
class convertToDecimal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String bin=sc.next();
        int len=bin.length();
        double res=0;
        int pow=0;
        for(int i=len-1;i>=0;i--)
        {
            if(bin.charAt(i)=='1')
            res=res+Math.pow(2,pow);

            pow++;
        }
        System.out.println("Decimal: "+res);
    }
}
