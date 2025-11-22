import java.util.*;
class DFS_Graph//using Adjancy List
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
    public static void dfs(ArrayList<Edge> graph[],boolean visited[],int curr)
    {
        System.out.print(curr+" ");
        visited[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(visited[e.dest]==false)
                dfs(graph,visited,e.dest);
        }
        return;
    }
    public static void main(String args[])
    {
        int vertex=4;
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        createGraph(graph);

        System.out.print("DFS Traversel: ");
        boolean visited[]=new boolean[vertex];
        dfs(graph,visited,0);
        //for broken graph in place above 1 line: 
        /*for(int i=0;i<vertex;i++)
        {
            if(visited[i]==false)
            dfs(graph,visited,i);
        }*/
        System.out.println();
    }
}
