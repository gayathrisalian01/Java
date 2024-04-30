class Solution {
    public int minimumTotalPrice(int n, int[][] edges, int[] price, int[][] trips) {
        List<Integer>[] tree = buildTree(n, edges);
        
        int[] visitCount = new int[n];
        for(int[] trip : trips) {
            travel(trip[0], -1, trip[1], tree, visitCount);
        }
        
        int[] cost = new int[n];
        int[][] calcualted = new int[n][2];
        for(int i = 0; i < n; i++) {
            Arrays.fill(calcualted[i], -1);
            cost[i] = price[i] * visitCount[i];
        }
        
        return minPrice(trips[0][0], -1, tree, 1, cost, calcualted);
    }
    
    private int minPrice(int node, int parent, List<Integer>[] tree, int canHalf, int[] cost, int[][] calculated) {
        if (calculated[node][canHalf] != -1) {
            return calculated[node][canHalf];
        }
        
        int minPrice;
        
        int noHalfCurrentNodePrice = cost[node];
        for(int next : tree[node]) {
            if (next != parent) {
                noHalfCurrentNodePrice += minPrice(next, node, tree, 1, cost, calculated);
            }
        }
        
        int halfCurrentNodePrice = Integer.MAX_VALUE;
        if (canHalf == 1) {
            halfCurrentNodePrice = cost[node] / 2;
            
            for(int next : tree[node]) {
                if (next != parent) {
                    halfCurrentNodePrice += minPrice(next, node, tree, 0, cost, calculated);
                }
            }
        }
        
        calculated[node][canHalf] = Math.min(noHalfCurrentNodePrice, halfCurrentNodePrice);
        
        return calculated[node][canHalf];
    }
    
    private boolean travel(int node, int parent, int target, List<Integer>[] tree, int[] visitCount) {
        if (node == target) {
            visitCount[node]++;
            return true;
        }

        boolean found = false;
        for(int next : tree[node]) {
            if (parent != next) {
                found |= travel(next, node, target, tree, visitCount);
            }
            
            if (found) {
                break;
            }
        }
        
        if (found) {
            visitCount[node]++;
        }
        
        return found;
    }
    
    private List<Integer>[] buildTree(int n, int[][] edges) {
        List<Integer>[] tree = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            tree[i] = new ArrayList<Integer>();
        }
        
        for(int[] edge : edges) {
            tree[edge[0]].add(edge[1]);
            tree[edge[1]].add(edge[0]);
        }
        
        return tree;
    }
}
