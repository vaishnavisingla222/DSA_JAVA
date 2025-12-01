import java.util.*;
import java.util.PriorityQueue;
//Implimented in wieghted graph
class Dijkstra_Algo //Shortest distance from source to all vertices using priority queue
{
    static class Edge
    {
        int src;//source
        int dest;//destination
        int weight;

        public Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[])
    {
        int len=graph.length;
        for(int i=0;i<len;i++)
            graph[i]=new ArrayList<Edge>();

        graph[0].add(new Edge(0,2,4));
        graph[0].add(new Edge(0,1,2));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }
    public static void dijkstra(ArrayList<Edge>[] graph,int vertex,int src) 
    {
        int[] dist=new int[vertex];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src]=0;

        //Min Heap(distance,node)
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0,src});

        while (!pq.isEmpty()) 
        {
            int[] curr=pq.poll();
            int currDist=curr[0];
            int u=curr[1];

            if (currDist>dist[u]) 
                continue;

            for(int i=0;i<graph[u].size();i++)
            {
                Edge edge=graph[u].get(i);
                int v=edge.dest;
                int w=edge.weight;
                if (dist[u]+w<dist[v])
                {
                    dist[v]=dist[u]+w;
                    pq.add(new int[]{dist[v],v});
                }
            }
        }
        System.out.println("Shortest distances:");
        for (int i=0;i<vertex;i++)
            System.out.println(src+" to "+i+ " -> "+dist[i]);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int vertex=6;
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        createGraph(graph);

        System.out.print("Enter the source node: ");
        int source=sc.nextInt();
        dijkstra(graph,vertex,source);
    }
}
