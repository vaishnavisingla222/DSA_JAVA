import java.util.*;
class BasicsTrie
{
    static class Node
    {
        Node[] child;
        boolean end;
        public Node()
        {
            child=new Node[26];
            end=false;
            for(int i=0;i<26;i++)
            child[i]=null;
        }
    }
    public static void insert(Node root,String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.child[idx]==null)
            curr.child[idx]=new Node();

            if(i==word.length()-1)
            curr.child[idx].end=true;

            curr=curr.child[idx];
        }
    }
    public static boolean searchWord(Node root,String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.child[idx]==null)
            return false;

            if(i==word.length()-1 && curr.child[idx].end==false)
            return false;

            curr=curr.child[idx];
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String[] words={"the","a","there","their","any"};
        int len1=words.length;
        Node root=new Node();

        //inserting words in trie
        for(int i=0;i<len1;i++)
        insert(root,words[i]);

        //searching words in trie
        System.out.println(searchWord(root,"the"));
        System.out.println(searchWord(root,"thor"));
        System.out.println(searchWord(root,"an"));
    }
}
