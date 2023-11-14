import java.util.Arrays;

public class MinimumPathSum {
    public static void main(String[] args) {
        int a[][]=new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        minPathSum(a);

    }
    public static int minPathSum(int[][] grid) {
        int path[][]=new int[grid.length][grid[0].length];
        path[0][0]=grid[0][0];
//        CalculatePath(grid,path,0,0);
        for (int i = 0; i < path.length; i++) {
            System.out.println(Arrays.toString(path[i]));
        }

        return path[grid.length-1][grid[0].length-1];
    }

    private static void CalculatePath(int d, int r,int a, int b,int[][] grid, int[][] path) {
        if (d>=grid.length||r>= grid[0].length) return;
        if (path[d+a][r+b]>path[d][r]+path[d+a][r+b] )

    }
}
