import java.util.*;
class Graph_2 //Adjancy List-Weighted Undirected Graph
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

        graph[0].add(new Edge(0,2,2));
        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));
        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }
    public static void main(String args[])
    {
        int vertex=4;
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        createGraph(graph);

        //print  neighbour
        for(int j=0;j<graph.length;j++)
        {
            System.out.print("Neighbour's of "+j+" vertex with the weight: ");
            for(int i=0;i<graph[j].size();i++)
            {
                Edge e=graph[j].get(i);
                System.out.print(e.dest+","+e.weight);
                if(i!=graph[j].size()-1)
                    System.out.print(" ; ");
            }
            System.out.println();
        }
    }
}
