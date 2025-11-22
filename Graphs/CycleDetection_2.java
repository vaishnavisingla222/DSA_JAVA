import java.util.ArrayList;

class CycleDetection_2//Directed graph
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

        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,0));
        graph[3].add(new Edge(3,2));
    }
    public static boolean cycleCheck(ArrayList<Edge> graph[],boolean visited[],int curr,boolean present[])
    {
        visited[curr]=true;
        present[curr]=true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(present[e.dest]==true)
                return true;
            else if(visited[e.dest]==false)
            {
                if(cycleCheck(graph, visited, e.dest, present))
                    return true;
            }
        }
        present[curr]=false;
        return false;
    }
    public static void main(String args[])
    {
        int vertex=4;
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        createGraph(graph);

        boolean visited[]=new boolean[vertex];
        boolean present[]=new boolean[vertex];
        boolean check=false;
        for(int i=0;i<vertex;i++)
        {
            if(visited[i]==false)
            {
                if(cycleCheck(graph,visited,i,present))
                {
                    check=true;
                    break;
                }
            }
        }
        if(check)
            System.out.println("Cycle is present");
        else
            System.out.println("Cycle is not present");
    }
}
