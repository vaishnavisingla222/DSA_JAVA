import java.util.*;
class AllPath 
{
    static class Edge
    {
        int src;//source
        int dest;//destination

        public Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[])
    {
        int len=graph.length;
        for(int i=0;i<len;i++)
            graph[i]=new ArrayList<Edge>();

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }
    public static void path(ArrayList<Edge> graph[],String path,boolean visited[],int curr,int target)
    {
        if(curr==target)
        {
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(visited[e.dest]==false)
            {
                visited[curr]=true;
                path(graph,path+"->"+e.dest,visited,e.dest,target);
                visited[curr]=false;//backtracking
            }
        }
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int vertex=4;
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        createGraph(graph);

        System.out.print("Enter the value of source and destination: ");
        int source=sc.nextInt();
        int dest=sc.nextInt();
        System.out.println("All paths from "+source+" to "+dest+":");
        boolean visited[]=new boolean[vertex];
        path(graph,""+source,visited,source,dest);
        System.out.println();
    }
}
