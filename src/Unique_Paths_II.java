public class Unique_Paths_II {
    public static void main(String[] args){
int a[][]={{0,0,0},{0,1,0},{0,0,0}};
a= new int[][]{{0,0},{0,1}};
System.out.println(uniquePathsWithObstacles(a));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        return findPath(0,0,obstacleGrid);
    }

    private static int whitoutMemoizationfindPath(int i,int j,int[][] obstacleGrid ){
        if (i>=obstacleGrid.length||j>=obstacleGrid.length) return 0;
        if (obstacleGrid[i][j]==1) return 0;
        if (i==obstacleGrid.length-1&&j==obstacleGrid.length-1) return 1;
        return findPath(i+1,j,obstacleGrid)+findPath(i,j+1,obstacleGrid);
    }

    private static int findPath(int i,int j,int[][] obstacleGrid ){
        if (i>=obstacleGrid.length||j>=obstacleGrid.length) return 0;
        if (obstacleGrid[i][j]==1) return 0;
        if (i==obstacleGrid.length-1&&j==obstacleGrid.length-1) return 1;
        return findPath(i+1,j,obstacleGrid)+findPath(i,j+1,obstacleGrid);
    }






}
