import java.util.*;

public class dfs {
    static LinkedList<Integer> adj[];
    static int nodes;

    public dfs(int nodes) {
        
        this.nodes = nodes;
        this.adj = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            this.adj[i] = new LinkedList<>();
        }
    }

    void addedge(int u, int v) {
        this.adj[u].add(v);
        this.adj[v].add(u);
    }

    static void displayadjacencylist(LinkedList<Integer> adj[], int V) {
        for (int i = 0; i < V; i++) {
            System.out.print(i + "->");
            for (int x : adj[i]) {
                System.out.print(x + "-> ");
            }
            System.out.println("NULL ");

        }
    }

    public static void Depthfirstsearch(int s) {
        boolean visited[] = new boolean[nodes];
        LinkedList<Integer> stk = new LinkedList<Integer>();
        visited[s] = true;
        stk.push(s);

        while (stk.size() != 0) {

            s = stk.pop();
            System.out.print(s + " ");

            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    stk.push(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        dfs g = new dfs(4);
        g.addedge(0, 1);
        g.addedge(1, 2);
        g.addedge(2, 3);
        g.addedge(3, 0);
        displayadjacencylist(g.adj, 4);
        System.out.println("DFS:");
        Depthfirstsearch(0);
    }
}

