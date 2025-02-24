class Solution {
    int n;
    int[] parent;
    int[] depth;
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        n = edges.length;
        parent = new int[n+1];
        depth = new int[n+1];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=edges.length;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        dfs(adj, -1, 0, 0);
        int curr = bob, bd = 0;
        while(curr!=-1){
            if(depth[curr]>bd){
                amount[curr] = 0;
            }else if(depth[curr]==bd){
                amount[curr] /= 2;
            }
            curr = parent[curr];
            bd++;
        }

        return dfs2(adj, 0, -1, amount);
    }

    public int dfs2(ArrayList<ArrayList<Integer>> adj, int node, int par, int[] amount){
        int total = amount[node], max = Integer.MIN_VALUE;
        for(Integer it: adj.get(node)){
            if(it!=par){
                max = Math.max(max, dfs2(adj, it, node, amount));
            }
        }
        return max==Integer.MIN_VALUE?total:total+max;
    }

    public void dfs(ArrayList<ArrayList<Integer>> adj, int par, int node, int d){
        depth[node] = d;
        parent[node] = par;

        for(Integer it: adj.get(node)){
            if(it!=par){
                dfs(adj, node, it, d+1);
            }
        }
    }
}
