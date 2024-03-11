import java.util.LinkedList;


public class linkedlistgraph {
    LinkedList<Integer> adj[];

    @SuppressWarnings("unchecked")
    public linkedlistgraph(int nodes) {
        this.adj=new LinkedList[nodes];
        for (int i=0;i<nodes;i++) {
            this.adj[i]=new LinkedList<>();
        }
    }

    void addedge(int u,int v) {
        this.adj[u].add(v);
        this.adj[v].add(u);
    }

    static void adjacencylist(LinkedList<Integer> adj[], int V) {
        for (int i=0;i<V;i++) {
            System.out.print(i+"->");
            for (int x:adj[i]) {
                
                System.out.print(x+"->");
            }
            System.out.print("null");
            System.out.println();
        }
    }

    public static void main(String args[]) {
        linkedlistgraph g = new linkedlistgraph(4);
        g.addedge(0, 1);
        g.addedge(1, 2);
        g.addedge(2, 3);
        g.addedge(3, 0);

        
        adjacencylist(g.adj, 4);
    }
}
