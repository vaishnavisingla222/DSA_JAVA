import java.util.*;
class Graph_1 //Adjancy List-Unweighted Undirected Graph
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
    public static void main(String args[])
    {
        int vertex=4;
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        createGraph(graph);

        //print  neighbour
        for(int j=0;j<graph.length;j++)
        {
            System.out.print("Neighbour's of "+j+" vertex: ");
            for(int i=0;i<graph[j].size();i++)
            {
                Edge e=graph[j].get(i);
                System.out.print(e.dest+" ");
            }
            System.out.println();
        }
    }
}
