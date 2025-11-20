import java.util.*;
class BFS_Graph_2 //using Adjancy List- more than 1 Graph-broken works for single graph also
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

        // Component A:nodes 0,1,2
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));

        //Component B:nodes 3,4,5,6
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(3,6));
        graph[4].add(new Edge(4,5));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,6));
        graph[5].add(new Edge(5,6));
    }
    public static void bfs(ArrayList<Edge> graph[],int vertex,boolean visited[],int start)
    {
        Queue<Integer> q=new LinkedList<>();
        
        q.add(start);
        while(!q.isEmpty())
        {
            int curr=q.remove();
            if(visited[curr]==false)
            {
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++)//to add neighbours of curr
                {
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String args[])
    {
        int vertex=8;
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        createGraph(graph);

        System.out.print("BFS Traversel: ");
        boolean visited[]=new boolean[vertex];
        for(int i=0;i<vertex;i++)
        {
            if(visited[i]==false)
                bfs(graph,vertex,visited,i);
        }
        System.out.println();
    }
}
