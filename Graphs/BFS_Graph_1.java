import java.util.*;
class Graph_BFS_1 //using Adjancy List- single Graph
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
        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }
    public static void bfs(ArrayList<Edge> graph[],int vertex)
    {
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[vertex];

        q.add(0);//starting point can be anything
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
        int vertex=7;
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        createGraph(graph);

        System.out.print("BFS Traversel: ");
        bfs(graph,vertex);
        System.out.println();
    }
}
