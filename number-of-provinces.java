class Solution {
    public int findCircleNum(int[][] isConnected) //adjaceny list 
    {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int provinces=0;

        for(int node=0;node< n;node++)
        {
            if(!visited[node])
            {
                provinces++;
                dfs(isConnected,visited,node);
            }
        }
       return provinces;
    }
    private void dfs(int[][] graph,boolean[] visited,int city)
    {
        visited[city]=true;

         for(int neighbour = 0; neighbour < graph.length; neighbour++) 
         {
            if(graph[city][neighbour]==1 && !visited[neighbour])
            {
                dfs(graph,visited,neighbour);
            }
         }
    }
}