import java.util.*;
/* we have to remove the consecutive duplicates+ original
 * eg. 1 2 3 3 4 5 4 3 2 2 2 1
 * ans=1 2 4 5 4 3 1
 */
class Remove_Subsequence 
{
    public static int[] remove(int[] arr)
    {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(st.size()==0 || st.peek()!=arr[i])//stack is empty or top ellement is not = to arr[i]
            st.push(arr[i]);

            else
            {
                if(st.peek()==arr[i])//top ellemnt = arr[i] there is a duplicate alreandy in stack and one in array don't add array one and remove of stack as well
                {
                    if(i==n-1 || arr[i]!=arr[i+1])
                    st.pop();
                    //if we are at last ellement jst remove the ellemnt at stack top else if arr[i]!=arr[i+1] then also remove stack top ellemnt else if arr[i]==arr[i+1] i.e more than 2 duplicates dont do anything go for last occurence and then delete the first occurrence
                }
            }
        }
        int[] res= new int[st.size()];
        for(int i=st.size()-1;i>=0;i--)
        res[i]=st.pop();

        return res;
    }
    public static void main(String args[])
    {
        int[] arr={1,2,2,3,4,4,4,5,6,6,7,2,3,4};
        int[] res=remove(arr);

        for(int i=0;i<res.length;i++)
        System.out.print(res[i]+" ");
    }
}