import java.util.*;
/*
Kruskal’s Algorithm gives a Minimum Spanning Tree (MST) with set of edges such that
With minimum total weight
That connects all vertices
With NO cycles
And exactly V-1 edges
*/
public class KruskalAlgo 
{
    static class Edge 
    {
        int src;
        int dest;
        int weight;
        Edge(int s,int d,int w) 
        {
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
    public static void createGraph(List<Edge> graph) 
    {
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, 1));
        graph.add(new Edge(1, 3, 7));
        graph.add(new Edge(2, 4, 3));
        graph.add(new Edge(3, 4, 5));
    }
    public static void sortByWeight(List<Edge> edges)
    {
        int len=edges.size();
        for (int i=0; i<len-1;i++)
        {
            for (int j=0;j<len-1-i;j++)
            {
                if (edges.get(j).weight>edges.get(j+1).weight)
                {
                    Edge temp=edges.get(j);
                    edges.set(j,edges.get(j+1));
                    edges.set(j+1,temp);
                }
            }
        }
    }
    public static int findParent(int x,int[] parent,int[] rank) 
    {
        if (parent[x]!=x)
            parent[x]=findParent(parent[x],parent,rank);

        return parent[x];
    }
    public static void union(int x, int y,int[] parent,int[] rank) 
    {
        int Px=findParent(x,parent,rank);
        int Py=findParent(y,parent,rank);
        if (Px==Py) 
            return;

        if (rank[Px]<rank[Py])
            parent[Px]=Py;

        else if(rank[Px]>rank[Py])
            parent[Py]=Px;
     
        else
        {
            parent[Py]=Px;
            rank[Px]++;
        }
    }
    public static void kruskal(List<Edge> edges, int vertex) 
    {
        sortByWeight(edges);

        int[] parent=new int[vertex];
        int[] rank=new int[vertex];
        for(int i=0;i<vertex;i++)
        {
            rank[i]=0;
            parent[i]=i;
        }
        List<Edge> mst=new ArrayList<>();
        int mstWeight=0;

        for (Edge edge:edges) 
        {
            int u=edge.src;
            int v=edge.dest;
            int parentU=findParent(u,parent,rank);
            int parentV=findParent(v,parent,rank);
            if (parentU!=parentV) 
            {
                mst.add(edge);
                mstWeight+=edge.weight;
                union(parentU, parentV,parent,rank);
            }
        }
        System.out.println("Kruskal's MST edges:");
        for (Edge e:mst)
            System.out.println(e.src+" to "+e.dest+" -> weight="+e.weight);

        System.out.println("Total weight of MST=" + mstWeight);
    }
    public static void main(String[] args) 
    {
        int vertex=5;
        List<Edge> graph=new ArrayList<>();
        createGraph(graph);
        kruskal(graph, vertex);
    }
}
