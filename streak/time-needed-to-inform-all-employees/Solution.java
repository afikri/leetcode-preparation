import java.util.ArrayList;
import java.util.List;

class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        
        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                adjList.get(manager[i]).add(i);
            }
        }
        
        return dfs(headID, adjList, informTime);
    }
    
    private int dfs(int employee, List<List<Integer>> adjList, int[] informTime) {
        int maxTime = 0;
        for (int subordinate : adjList.get(employee)) {
            maxTime = Math.max(maxTime, dfs(subordinate, adjList, informTime));
        }
        return informTime[employee] + maxTime;
    }
}
