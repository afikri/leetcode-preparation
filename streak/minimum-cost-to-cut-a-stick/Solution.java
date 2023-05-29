import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int c(int i, int j, List<Integer> cuts, List<List<Integer>> dp) {
        if (i > j)
            return 0;
            
        if (dp.get(i).get(j) != -1)
            return dp.get(i).get(j);
        
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j; k++) {
            int h = cuts.get(j + 1) - cuts.get(i - 1) + c(i, k - 1, cuts, dp) + c(k + 1, j, cuts, dp);
            ans = Math.min(ans, h);
        }
        
        dp.get(i).set(j, ans);
        return ans;
    }

    public int minCost(int n, List<Integer> cuts) {
        cuts.add(n);
        cuts.add(0, 0);
        Collections.sort(cuts);
        List<List<Integer>> dp = new ArrayList<>(cuts.size());
        for (int i = 0; i < cuts.size(); i++) {
            dp.add(new ArrayList<>(Collections.nCopies(cuts.size(), -1)));
        }
        
        return c(1, cuts.size() - 2, cuts, dp);
    }
}
