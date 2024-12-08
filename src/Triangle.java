import java.util.List;

public class Triangle {
public static void main(String[] args){

}
    public int minimumTotal1(List<List<Integer>> triangle) {
        Object [][] t=new Object [triangle.size()][];
        for(int i = 0; i < triangle.size(); i++) {
            t[i]=triangle.get(i).toArray();
        }
        return minOfNode1(t, 0, 0);
    }

    private int minOfNode1(Object[][] triangle, int level, int node) {
        // Check if we are beyond the last level
        if (level >= triangle.length) {
            return 0;
        }
        // Check if the node index is valid for the current level
        if (node >= triangle[level].length) {
            return 0;
        }

        int left = minOfNode1(triangle, level + 1, node);
        int right = minOfNode1(triangle, level + 1, node + 1);
        return Math.min(left, right) + (int)triangle[level][node];
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for(int i = 0; i < triangle.get(triangle.size()-1).size(); i++) {
            dp[triangle.size()-1][i] = triangle.get(triangle.size()-1).get(i);
        }

        for(int row =triangle.size()-2; row >=0; row--) {
            for(int col = triangle.get(row).size()-1; col >=0 ; col--) {
                dp[row][col]=Math.min(dp[row+1][col],dp[row+1][col+1])+triangle.get(row).get(col);
            }
        }



        return dp[0][0];

    }



        public int minimumTotal(List<List<Integer>> triangle) {
            return minOfNode(triangle, 0, 0);
        }

        private int minOfNode(List<List<Integer>> triangle, int level, int node) {
            // Check if we are beyond the last level
            if (level >= triangle.size()) {
                return 0;
            }
            // Check if the node index is valid for the current level
            if (node >= triangle.get(level).size()) {
                return 0;
            }

            int left = minOfNode(triangle, level + 1, node);
            int right = minOfNode(triangle, level + 1, node + 1);
            return Math.min(left, right) + triangle.get(level).get(node);

    }
    }


